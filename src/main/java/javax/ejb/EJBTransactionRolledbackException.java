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
 * This exception indicates that the transaction associated with processing
 * of the request has been rolled back, or marked to roll back. Thus the
 * requested operation either could not be performed or was not performed
 * because further computation on behalf of the transaction would be fruitless.
 * 
 * @version $Revision$
 */
public class EJBTransactionRolledbackException extends EJBException {

  /**
   * Constructs a TransactionRolledbackLocalException with no detail message.
   */
  public EJBTransactionRolledbackException() {
    super();
  }

  /**
   * Constructs a TransactionRolledbackLocalException with the specified detailed message.
   *
   * @param message - The detailed message.
   */
  public EJBTransactionRolledbackException(String message) {
    super(message);
  }

  /**
   * Constructs a TransactionRolledbackLocalException with the specified detail
   * message and a nested exception.
   *
   * @param message - The detailed message.
   * @param ex - The originally thrown exception.
   */
  public EJBTransactionRolledbackException(String message,Exception ex) {
    super(message,ex);
  }
}
