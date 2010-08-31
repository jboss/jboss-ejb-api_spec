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
 * A NoSuchObjectLocalException is thrown if an attempt is made to invoke
 * a method on an object that no longer exists.
 */
public class NoSuchObjectLocalException extends EJBException {

  /**
   * Constructs a NoSuchObjectLocalException with no detail message.
   */
  public NoSuchObjectLocalException() {
    super();
  }

  /**
   * Constructs a NoSuchObjectLocalException with the specified detailed message.
   *
   * @param message - The detailed message.
   */
  public NoSuchObjectLocalException(String message) {
    super(message);
  }

  /**
   * Constructs a NoSuchObjectLocalException with the specified detail message and a
   * nested exception.
   *
   * @param message - The detailed message.
   * @param ex - The originally thrown exception.
   */
  public NoSuchObjectLocalException(String message, Exception ex) {
    super(message,ex);
  }
}
