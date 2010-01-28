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
package javax.ejb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A stateless session bean must be annotated with the Stateless annotation or
 * denoted in the deployment descriptor as a stateless session bean. If other
 * annotations are applied to the bean class or its members, the Stateless
 * annotation must be used. The bean class does not implement the
 * javax.ejb.SessionBean interface.
 * 
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision: 42322 $
 */
@Target(ElementType.TYPE) @Retention(RetentionPolicy.RUNTIME)
   public @interface Stateless
{
   String name() default "";
   String mappedName() default "";
   String description() default "";
}
