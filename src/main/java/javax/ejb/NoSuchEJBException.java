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
