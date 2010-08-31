/*
 *  JBoss, Home of Professional Open Source
 *  Copyright 2010 Red Hat, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package javax.ejb.embeddable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ejb.EJBException;
import javax.ejb.spi.EJBContainerProvider;
import javax.naming.Context;

/**
 * Used to execute an EJB application in an embeddable container.
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
public abstract class EJBContainer
{
   public static final String APP_NAME = "javax.ejb.embeddable.appName";
   public static final String MODULES = "javax.ejb.embeddable.modules";
   public static final String PROVIDER = "javax.ejb.embeddable.provider";
   
   private static final Pattern nonCommentPattern = Pattern.compile("^([^#]+)");

   private static List<EJBContainerProvider> factories = new ArrayList<EJBContainerProvider>();
   
   static
   {
      findAllFactories();
   }
   
   /**
    * Shutdown an embeddable EJBContainer instance.
    */
   public abstract void close();
   
   /**
    * Create and initialize an embeddable EJB container. 
    * JVM classpath is searched for all ejb-jars or exploded ejb-jars in directory format.
    * 
    * @return EJBContainer instance
    * @throws EJBException Thrown if the container or application could not 
    *   be successfully initialized.
    */
   public static EJBContainer createEJBContainer() throws EJBException
   {
      return createEJBContainer(null);
   }
   
   /**
    * Create and initialize an embeddable EJB container with an 
    * set of configuration properties and names of modules to be initialized. 
    * 
    * @param properties One or more spec-defined or vendor-specific properties. 
    *   The spec reserves the prefix "javax.ejb." for spec-defined properties.
    * @return EJBContainer instance
    * @throws EJBException Thrown if the container or application could not 
    *   be successfully initialized.
    */
   public static EJBContainer createEJBContainer(Map<?, ?> properties)
      throws EJBException
   {
      for(EJBContainerProvider factory : factories)
      {
         EJBContainer container = factory.createEJBContainer(properties);
         if(container != null)
            return container;
      }
      throw new EJBException("Unable to instantiate container with factories " + factories);
   }
   
   private static List<String> factoryNamesFromReader(BufferedReader reader) throws IOException
   {
      List<String> names = new ArrayList<String>();
      String line;
      while ((line = reader.readLine()) != null)
      {
         line = line.trim();
         Matcher m = nonCommentPattern.matcher(line);
         if (m.find())
         {
            names.add(m.group().trim());
         }
      }
      return names;
   }
   
   private static void findAllFactories()
   {
      try
      {
         ClassLoader loader = Thread.currentThread().getContextClassLoader();
         Enumeration<URL> resources = loader.getResources("META-INF/services/" + EJBContainerProvider.class.getName());
         Set<String> names = new HashSet<String>();
         while (resources.hasMoreElements())
         {
            URL url = resources.nextElement();
            InputStream is = url.openStream();
            try
            {
               names.addAll(factoryNamesFromReader(new BufferedReader(new InputStreamReader(is))));
            }
            finally
            {
               is.close();
            }
         }
         for (String s : names)
         {
            Class<?> factoryClass = loader.loadClass(s);
            factories.add(EJBContainerProvider.class.cast(factoryClass.newInstance()));
         }
      }
      catch (IOException e)
      {
         throw new EJBException(e);
      }
      catch (InstantiationException e)
      {
         throw new EJBException(e);
      }
      catch (IllegalAccessException e)
      {
         throw new EJBException(e);
      }
      catch (ClassNotFoundException e)
      {
         throw new EJBException(e);
      }
   }
   
   /**
    * Retrieve a naming context for looking up references to session beans executing in
    * the embeddable container.
    * 
    * @return The naming context.
    */
   public abstract Context getContext();
}
