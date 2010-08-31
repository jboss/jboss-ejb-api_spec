/*
 *  JBoss, Home of Professional Open Source
 *  Copyright 2010 Red Hat, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
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
