/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
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
package javax.ejb;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Component-defining annotation for a singleton session bean. 
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
@Target(TYPE)
@Retention(RUNTIME)
public @interface Singleton {
   String description() default "";
   
   /**
    * A product specific name (in JBoss the global JNDI name) that this 
    * session bean should be mapped to. Application servers are not 
    * required to support any particular form or type of mapped name, 
    * nor the ability to use mapped names. The mapped name is product-dependent 
    * and often installation-dependent. No use of a mapped name is portable. 
    */
   String mappedName() default "";
   
   /**
    * The ejb-name of this bean.
    */
   String name() default "";
}
