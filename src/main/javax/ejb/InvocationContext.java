/*
 * JBoss, Home of Professional Open Source
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.ejb;

import java.lang.reflect.Method;

/**
 * The InvocationContext object provides the metadata that is required for
 * AroundInvoke interceptor methods.
 * 
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 * @version $Revision$
 */
public interface InvocationContext
{
   public Object getBean();

   public Method getMethod();

   public Object[] getParameters();

   public void setParameters(Object[] params);

   public EJBContext getEJBContext();

   public java.util.Map getContextData();

   public Object proceed() throws Exception;
}