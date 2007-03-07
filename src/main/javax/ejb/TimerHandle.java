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

import java.io.Serializable;

/**
 * The TimerHandle interface is implemented by all EJB timer handles.
 **/
public interface TimerHandle
    extends Serializable
{
   
   /**
    * Obtain a reference to the timer represented by this handle.
    *
    * @return Timer which this handle represents
    *
    * @throws IllegalStateException If this method is invoked while the instance is in
    *                               a state that does not allow access to this method.
    * @throws NoSuchObjectLocalException If invoked on a timer that has expired or has been cancelled.
    * @throws EJBException If this method could not complete due to a system-level failure.
    **/
   public Timer getTimer()
      throws
         IllegalStateException,
         NoSuchObjectLocalException,
         EJBException;
}
