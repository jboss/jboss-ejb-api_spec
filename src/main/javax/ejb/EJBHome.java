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
 * <P>The EJBHome interface must be extended by all enterprise Beans' remote home interfaces.
 * An enterprise Bean's remote home interface defines the methods that allow a remote client to
 * create, find, and remove EJB objects, as well as home business methods that are not specific to
 * a bean instance (Session Beans do not have finders and home methods).</P>
 *
 * <P>The remote home interface is defined by the enterprise Bean provider and implemented by the
 * enterprise Bean container.</P>
 */
public interface EJBHome extends java.rmi.Remote {

   /**
    * Remove an EJB object identified by its handle.
    *
    * @exception java.rmi.RemoteException - Thrown when the method failed due to a system-level failure.
    * @exception RemoveException - Thrown if the enterprise Bean or the container does not allow
    * the client to remove the object.
    */
   public void remove(Handle handle) throws RemoteException, RemoveException;

   /**
    * <P>Remove an EJB object identified by its primary key.</P>
    *
    * <P>This method can be used only for an entity bean. An attempt to call this method on
    * a session bean will result in a RemoteException.</P>
    *
    * @exception java.rmi.RemoteException - Thrown when the method failed due to a system-level failure.
    * @exception RemoveException - Thrown if the enterprise Bean or the container does not allow
    * the client to remove the object.
    */
   public void remove(Object primaryKey) throws RemoteException, RemoveException;

  /**
   * <P>Obtain the EJBMetaData interface for the enterprise Bean. The EJBMetaData interface allows
   * the client to obtain information about the enterprise Bean.</P>
   *
   * <P>The information obtainable via the EJBMetaData interface is intended to be used by tools.</P>
   *
   * @return The enterprise Bean's EJBMetaData interface.
   * @exception java.rmi.RemoteException - Thrown when the method failed due to a system-level failure.
   */
  public EJBMetaData getEJBMetaData() throws RemoteException;

  /**
   * Obtain a handle for the remote home object. The handle can be used at later time to re-obtain
   * a reference to the remote home object, possibly in a different Java Virtual Machine.
   *
   * @return A handle for the remote home object.
   * @exception java.rmi.RemoteException - Thrown when the method failed due to a system-level failure.
   */
  public HomeHandle getHomeHandle() throws RemoteException;

}
