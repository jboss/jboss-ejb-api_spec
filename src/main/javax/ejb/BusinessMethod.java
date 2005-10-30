/*
* JBoss, Home of Professional Open Source
* Copyright 2005, JBoss Inc., and individual contributors as indicated
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
 * By default, when generating interfaces, all public methods other than
 * injection methods of the bean class will be on the generated interface. This
 * default can be overridden by using the BusinessMethod annotation to
 * explicitly specify those public methods that are to be part of the business
 * interface. If the BusinessMethod annotation is used, only the methods to
 * which it is applied will be part of the generated business interface.
 * 
 * @author <a href="mailto:kabir.khan@jboss.com">Kabir Khan</a>
 * @version $Revision$
 */
@Target(ElementType.METHOD) @Retention(RetentionPolicy.RUNTIME)
   public @interface BusinessMethod
{
}