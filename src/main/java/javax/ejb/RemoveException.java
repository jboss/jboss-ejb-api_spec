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
 * The RemoveException exception is thrown at an attempt to remove an EJB
 * object when the enterprise Bean or the container does not allow the EJB
 * object to be removed.
 */
public class RemoveException extends Exception {

  /**
   * Constructs an RemoveException with no detail message.
   */
  public RemoveException() {
    super();
  }

  /**
   * Constructs an RemoveException with the specified detail message.
   *
   * @param message - The detailed message.
   */
  public RemoveException(String message) {
    super(message);
  }
}
