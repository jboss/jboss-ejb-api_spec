/*
* JBoss, Home of Professional Open Source
* Copyright 2010, JBoss Inc., and individual contributors as indicated
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* This is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as
* published by the Free Software Foundation; either version 2.1 of
* the License, or (at your option) any later version.
*
* This software is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this software; if not, write to the Free
* Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
* 02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/
package javax.annotation;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Resource annotation is used to express a dependency on an external
 * resource in the bean’s environment. The name property refers to the name by
 * which the resource is to be known in the environment; the type is the
 * resource manager connection factory type. The authenticationType member
 * specifies whether the container or bean is to perform authentication. The
 * shareable member refers to the sharability of resource manager connections.
 * 
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target({TYPE, FIELD, METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Resource
{
   /**
    * Enums for whether the container or bean is to perform authentication.
    */
   public enum AuthenticationType
   {
      CONTAINER,
      APPLICATION
   }

   String name() default "";

   Class type() default Object.class;

   AuthenticationType authenticationType() default AuthenticationType.CONTAINER;

   boolean shareable() default true;

   String description() default "";

   String mappedName() default "";

}
