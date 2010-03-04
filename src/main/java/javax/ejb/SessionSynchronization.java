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

import java.rmi.RemoteException;

/**
 * <P>The SessionSynchronization interface allows a session Bean instance
 * to be notified by its container of transaction boundaries.</P>
 * 
 * <P>An session Bean class is not required to implement this interface. A
 * session Bean class should implement this interface only if it wishes to
 * synchronize its state with the transactions.</P>
 */
public interface SessionSynchronization {

  /**
   * <P>The afterBegin method notifies a session Bean instance that a new transaction has started, and that
   * the subsequent business methods on the instance will be invoked in the context of the transaction.</P>
   *
   * <P>The instance can use this method, for example, to read data from a database and cache the data in
   * the instance fields.</P>
   *
   * <P>This method executes in the proper transaction context.</P>
   *
   * @exception EJBException - Thrown by the method to indicate a failure caused by a system-level error.
   * @exception java.rmi.RemoteException - This exception is defined in the method signature to provide backward
   * compatibility for enterprise beans written for the EJB 1.0 specification. Enterprise beans written for the
   * EJB 1.1 and higher specifications should throw the javax.ejb.EJBException instead of this exception.
   * Enterprise beans written for the EJB 2.0 and higher specifications must not throw the java.rmi.RemoteException.
   */
  public void afterBegin() throws EJBException, RemoteException;

  /**
   * <P>The beforeCompletion method notifies a session Bean instance that a transaction is about to be committed.
   * The instance can use this method, for example, to write any cached data to a database.</P>
   *
   * <P>This method executes in the proper transaction context.</P>
   *
   * <P><B>Note:</B> The instance may still cause the container to rollback the transaction by invoking the
   * setRollbackOnly() method on the instance context, or by throwing an exception.</P>
   *
   * @exception EJBException - Thrown by the method to indicate a failure caused by a system-level error.
   * @exception java.rmi.RemoteException - This exception is defined in the method signature to provide backward
   * compatibility for enterprise beans written for the EJB 1.0 specification. Enterprise beans written for the
   * EJB 1.1 and higher specifications should throw the javax.ejb.EJBException instead of this exception.
   * Enterprise beans written for the EJB 2.0 and higher specifications must not throw the java.rmi.RemoteException.
   */
  public void beforeCompletion() throws EJBException, RemoteException;

   /**
    * <P>The afterCompletion method notifies a session Bean instance that a transaction commit protocol has
    * completed, and tells the instance whether the transaction has been committed or rolled back.</P>
    *
    * <P>This method executes with no transaction context.</P>
    *
    * <P>This method executes with no transaction context.</P>
    *
    * @param committed - True if the transaction has been committed, false if is has been rolled back.
    * @exception EJBException - Thrown by the method to indicate a failure caused by a system-level error.
    * @exception java.rmi.RemoteException - This exception is defined in the method signature to provide backward
    * compatibility for enterprise beans written for the EJB 1.0 specification. Enterprise beans written for the
    * EJB 1.1 and higher specifications should throw the javax.ejb.EJBException instead of this exception.
    * Enterprise beans written for the EJB 2.0 and higher specifications must not throw the java.rmi.RemoteException.
    */
   public void afterCompletion(boolean committed) throws EJBException, RemoteException;
}
