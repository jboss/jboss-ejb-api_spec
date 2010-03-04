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
 * The MessageDrivenBean interface is implemented by every message driven
 * enterprise bean class.  The container uses the MessageDrivenBean methods
 * to notify the enterprise bean instances of the instance's life cycle events.
 */
public interface MessageDrivenBean extends EnterpriseBean {

  /**
   * <P>Set the associated message-driven context. The container calls this method after the
   * instance creation.</P>
   *
   * <P>The enterprise Bean instance should store the reference to the context object in an instance
   * variable.</P>
   *
   * <P>This method is called with no transaction context.</P>
   *
   * @param ctx - A MessageDrivenContext interface for the instance.
   * @exception EJBException - Thrown by the method to indicate a failure caused by a system-level error.
   */
  public void setMessageDrivenContext( MessageDrivenContext ctx ) throws EJBException;
   
   /**
    * <P>A container invokes this method before it ends the life of the message-driven object.
    * This happens when a container decides to terminate the message-driven object.</P>
    *
    * <P>This method is called with no transaction context.</P>
    *
    * @exception EJBException - Thrown by the method to indicate a failure caused by a system-level error.
    */
   public void ejbRemove() throws EJBException;
}
