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
 * The DuplicateKeyException exception is thrown if an entity EJB
 * object cannot be created because an object with the same key already
 * exists. This exception is thrown by the create methods defined in an
 * enterprise Bean's home interface.
 */
public class DuplicateKeyException extends CreateException {

  /**
   * Constructs an DuplicateKeyException with no detail message. 
   */
  public DuplicateKeyException() {
    super();
  }

  /**
   * Constructs an DuplicateKeyException with the specified detail message.
   *
   * @param message - The detailed message
   */
  public DuplicateKeyException(String message) {
    super(message);
  }
}
