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
}
