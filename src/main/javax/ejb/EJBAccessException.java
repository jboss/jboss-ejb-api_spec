/*
 * JBoss, the OpenSource EJB server
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.ejb;

/**
 * An AccessLocalException is thrown to indicate that the caller does not
 * have permission to call the method. This exception is thrown to local clients.
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
