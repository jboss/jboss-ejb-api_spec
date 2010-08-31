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
 * The TimedObject interface contains the callback method that is used
 * to deliver timer expiration notifications. It is implemented by an
 * entity bean or stateless session bean or message-driven bean class.
 **/
public interface TimedObject {
   
   /**
    * Invoked by the EJB container upon timer expiration.
    *
    * @param timer Timer whose expiration caused this notification
    **/
   public void ejbTimeout( Timer timer );
}
