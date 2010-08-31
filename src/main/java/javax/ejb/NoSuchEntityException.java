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
 * <p>The NoSuchEntityException exception is thrown by an Entity Bean
 * instance to its container to report that the invoked business method
 * or callback method could not be completed because of the underlying
 * entity was removed from the database.</p>
 *
 * <p>This exception may be thrown by the bean class methods that implement
 * the business methods defined in the bean's component interface; and by the
 * ejbLoad and ejbStore methods.</p>
 */
public class NoSuchEntityException extends EJBException {

  /**
   * Constructs a NoSuchEntityException with no detail message.
   */
  public NoSuchEntityException() {
    super();
  }

  /**
   * Constructs a NoSuchEntityException with the specified detailed message.
   *
   * @param message - The detailed message.
   */
  public NoSuchEntityException(String message) {
    super(message);
  }
   
   /**
    * Constructs a NoSuchEntityException that embeds the originally thrown exception.
    *
    * @param ex - The originally thrown exception.
    */
   public NoSuchEntityException(Exception ex) {
     super(ex);
   }
}
