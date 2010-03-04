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
 * The EJBException exception is thrown by an enterprise Bean instance to its
 * container to report that the invoked business method or callback method
 * could not be completed because of an unexpected error (e.g. the instance
 * failed to open a database connection).
 */
public class EJBException extends RuntimeException
{
   /** @since 4.0.2 */
   private static final long serialVersionUID = 796770993296843510L;
   private Exception causeException;
   
   /**
    * Constructs an EJBException with no detail message.
    */
   public EJBException()
   {
      super();
      causeException = null;
   }
   
   /**
    * Constructs an EJBException with the specified detailed message.
    *
    * @param message - The detailed message.
    */
   public EJBException(String message)
   {
      super(message);
      causeException = null;
   }

   /**
    * Constructs an EJBException that embeds the originally thrown exception.
    *
    * @param ex - The originally thrown exception.
    */
   public EJBException(Exception ex)
   {
      super(ex);
      causeException = ex;
   }

   /**
    * Constructs an EJBException with the specified message and the
    * originally throw exception.
    *
    * @param message - The detailed message.
    * @param ex - The originally thrown exception.
    */
   public EJBException(String message, Exception ex)
   {
      super(message, ex);
      causeException = ex;
   }

   /**
    * Obtain the exception that caused the EJBException being thrown.
    *
    * @return The originally thrown exception.
    */
   public Exception getCausedByException()
   {
      return causeException;
   }

}

