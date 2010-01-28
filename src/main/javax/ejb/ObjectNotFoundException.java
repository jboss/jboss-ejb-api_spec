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
