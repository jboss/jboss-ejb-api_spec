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
 * <p>The ObjectNotFoundException exception is thrown by a finder method
 * to indicate that the specified EJB object does not exist.</p>
 *
 * <p>Only the finder methods that are declared to return a single EJB object
 * use this exception. This exception should not be thrown by finder methods
 * that return a collection of EJB objects (they should return an empty collection
 * instead).</p>
 */
public class ObjectNotFoundException extends FinderException {

  /**
   * Constructs an ObjectNotFoundException with no detail message.
   */
  public ObjectNotFoundException() {
    super();
  }

  /**
   * Constructs an ObjectNotFoundException with the specified detail message.
   *
   * @param message - The detailed message.
   */
  public ObjectNotFoundException(String message) {
    super(message);
  }
}
