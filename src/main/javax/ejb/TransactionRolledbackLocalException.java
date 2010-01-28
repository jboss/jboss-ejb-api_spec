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
 * This exception indicates that the transaction associated with processing
 * of the request has been rolled back, or marked to roll back. Thus the
 * requested operation either could not be performed or was not performed
 * because further computation on behalf of the transaction would be fruitless.
 */
public class TransactionRolledbackLocalException extends EJBException {

  /**
   * Constructs a TransactionRolledbackLocalException with no detail message.
   */
  public TransactionRolledbackLocalException() {
    super();
  }

  /**
   * Constructs a TransactionRolledbackLocalException with the specified detailed message.
   *
   * @param message - The detailed message.
   */
  public TransactionRolledbackLocalException(String message) {
    super(message);
  }

  /**
   * Constructs a TransactionRolledbackLocalException with the specified detail
   * message and a nested exception.
   *
   * @param message - The detailed message.
   * @param ex - The originally thrown exception.
   */
  public TransactionRolledbackLocalException(String message,Exception ex) {
    super(message,ex);
  }
}
