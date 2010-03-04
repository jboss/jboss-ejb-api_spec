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
 * <P>The FinderException exception must be included in the throws clause
 * of every findMETHOD(...) method of an entity Bean's home interface.</P>
 * 
 * <P>The exception is used as a standard application-level exception to,
 * report a failure to find the requested EJB object(s).</P>
 */
public class FinderException extends Exception {

  /**
   * Constructs an FinderException with no detail message.
   */
  public FinderException() {
    super();
  }

  /**
   * Constructs an FinderException with the specified detail message.
   *
   * @param message The detailed message.
   */
  public FinderException(String message) {
    super(message);
  }
}
