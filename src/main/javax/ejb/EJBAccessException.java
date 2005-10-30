/*
* JBoss, Home of Professional Open Source
* Copyright 2005, JBoss Inc., and individual contributors as indicated
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
 * An AccessLocalException is thrown to indicate that the caller does not
 * have permission to call the method. This exception is thrown to local clients.
 * @version $Revision$
 */
public class EJBAccessException extends EJBException {

  /**
   * Constructs an AccessLocalException with no detail message.
   */
  public EJBAccessException() {
    super();
  }

  /**
   * Constructs an AccessLocalException with the specified detail message.
   *
   * @param message - The detailed message
   */
  public EJBAccessException(String message) {
    super(message);
  }

  /**
   * Constructs an AccessLocalException with the specified detail message and a nested exception.
   *
   * @param message - The detailed message
   * @param ex - The nested exception
   */
  public EJBAccessException(String message,
                              Exception ex) {
    super(message,ex);
  }
}
