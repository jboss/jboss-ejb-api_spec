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

import java.rmi.RemoteException;

/**
 * The Handle interface is implemented by all EJB object handles. A handle
 * is an abstraction of a network reference to an EJB object. A handle is
 * intended to be used as a "robust" persistent reference to an EJB object.
 */
public interface Handle extends java.io.Serializable {

  /**
   * Obtains the EJB object reference represented by this handle.
   *
   * @return The EJB object reference represented by this handle.
   * @exception java.rmi.RemoteException - The EJB object could not be obtained because of a
   * system-level failure.
   */
  public EJBObject getEJBObject() throws RemoteException;
}
