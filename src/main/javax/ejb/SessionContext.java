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

import javax.xml.rpc.handler.MessageContext;

/**
 * The SessionContext interface provides access to the runtime session
 * context that the container provides for a session enterprise Bean
 * instance. The container passes the SessionContext interface to an
 * instance after the instance has been created. The session context
 * remains associated with the instance for the lifetime of the instance.
 * @version $Revision:78081 $
 */
public interface SessionContext extends EJBContext
{

  /**
   * <P>Obtain a reference to the EJB local object that is currently associated with the instance.</P>
   *
   * <P>An instance of an entity enterprise Bean can call this method only when the instance is associated
   * with an EJB local object identity, i.e. in the ejbActivate, ejbPassivate, ejbPostCreate, ejbRemove, ejbLoad,
   * ejbStore, and business methods.</P>
   *
   * <P>An instance can use this method, for example, when it wants to pass a reference to itself in a method
   * argument or result.</P>
   *
   * @return The EJB local object currently associated with the instance.
   * @exception java.lang.IllegalStateException - Thrown if the instance invokes this method while the instance
   * is in a state that does not allow the instance to invoke this method, or if the instance does not have a
   * local interface.
   */
  public EJBLocalObject getEJBLocalObject() throws IllegalStateException;

  /**
   * <P>Obtain a reference to the EJB object that is currently associated with the instance.</P>
   *
   * <P>An instance of a session enterprise Bean can call this method at anytime between the ejbCreate()
   * and ejbRemove() methods, including from within the ejbCreate() and ejbRemove() methods.</P>
   *
   * <P>An instance can use this method, for example, when it wants to pass a reference to itself in a method
   * argument or result.</P>
   *
   * @return The EJB object currently associated with the instance.
   * @exception java.lang.IllegalStateException - Thrown if the instance invokes this method while the instance
   * is in a state that does not allow the instance to invoke this method, or if the instance does not have a
   * remote interface.
   */
  public EJBObject getEJBObject() throws IllegalStateException;

   /** Obtain a reference to the JAX-RPC MessageContext. An instance of a
    * stateless session bean can call this method from any business method
    * invoked through its web service endpoint interface. 
    * 
    * @return The MessageContext for this web service invocation.
    * @throws IllegalStateException - Thrown if this method is invoked while
    * the instance is in a state that does not allow access to this method.
    */ 
   public MessageContext getMessageContext() throws IllegalStateException;
   
   /** Returns the session bean�s business interface. Only session beans with an EJB 3.0 business interface
    * can call this method.
    * 
    * @return The business interface associated with the instance.
    * @throws IllegalStateException - Thrown if this method is invoked while
    * the instance is in a state that does not allow access to this method.
    */ 
   public <T> T getBusinessObject(Class<T> businessInterface) throws IllegalStateException;
   
   /** Returns the session bean business interface through which the bean was invoked.
    * 
    * @return The business interface through which the bean was invoked.
    * @throws IllegalStateException - Thrown if this method is invoked while
    * the instance is in a state that does not allow access to this method.
    */ 
   public Class getInvokedBusinessInterface() throws IllegalStateException;
   
   /**
    * Check whether a client has requested that the current asynchronous invocation
    * be cancelled.
    * 
    * @return true if the client has invoked Future.cancel()
    * @throws IllegalStateException Thrown if not invoked from within an asynchronous 
    *   business method invocation with return type Future.
    * @since 3.1
    */
   boolean wasCancelCalled() throws IllegalStateException;
}
