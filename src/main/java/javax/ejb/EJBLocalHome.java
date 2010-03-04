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

/**
 * <p>The EJBLocalHome interface must be extended by all enterprise Beans'
 * local home interfaces. An enterprise Bean's local home interface defines
 * the methods that allow local clients to create, find, and remove EJB
 * objects, as well as home business methods that are not specific to a
 * bean instance (session Beans do not have finders and home business methods).</p>
 *
 * <p>The local home interface is defined by the enterprise Bean provider
 * and implemented by the enterprise Bean container.</p>
 */
public interface EJBLocalHome {

  /**
   * <p>Remove an EJB object identified by its primary key.</p>
   *
   * <p>This method can only be used by local clients of an entity bean.
   * An attempt to call this method on a session bean will result in an EJBException.</p>
   *
   * @param primaryKey - The primary key
   * @exception RemoveException - Thrown if the enterprise Bean or the container does
   *                              not allow the client to remove the object.
   * @exception EJBException - Thrown when the method failed due to a system-level failure.
   */
  public void remove(java.lang.Object primaryKey)
    throws RemoveException, EJBException;
}
