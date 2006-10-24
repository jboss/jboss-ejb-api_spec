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
 * A NoSuchEJBException is thrown if an attempt is made to invoke
 * a method on an object that no longer exists.
 * @version $Revision$
 */
public class NoSuchEJBException extends EJBException {
   private static final long serialVersionUID = -4861625171310593950L;

  /**
   * Constructs a NoSuchEJBException with no detail message.
   */
  public NoSuchEJBException() {
    super();
  }

  /**
   * Constructs a NoSuchEJBException with the specified detailed message.
   *
   * @param message - The detailed message.
   */
  public NoSuchEJBException(String message) {
    super(message);
  }

  /**
   * Constructs a NoSuchEJBException with the specified detail message and a
   * nested exception.
   *
   * @param message - The detailed message.
   * @param ex - The originally thrown exception.
   */
  public NoSuchEJBException(String message, Exception ex) {
    super(message,ex);
  }
}
