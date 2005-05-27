/*
 * JBoss, the OpenSource EJB server
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.ejb;

/**
 * This exception indicates that a request carried a null transaction context,
 * but the target object requires an activate transaction.
 */
public class EJBTransactionRequiredException extends EJBException {

  /**
   * Constructs a TransactionRequiredLocalException with no detail message.
   */
  public EJBTransactionRequiredException() {
    super();
  }

  /**
   * Constructs a TransactionRequiredLocalException with the specified detailed message.
   *
   * @param message - The detailed message.
   */
  public EJBTransactionRequiredException(String message) {
    super(message);
  }
}
