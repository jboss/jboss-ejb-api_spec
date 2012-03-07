package javax.ejb;

/**
 * <P>The CreateException exception must be included in the throws clauses of
 * all create(...) methods define in an enterprise Bean's remote interface.</P>
 * <P>The exception is used as a standard application-level exception
 * to report a failure to create an entity EJB object. </P>
 */
public class CreateException extends Exception {
   
  /**
    * 
    */
   private static final long serialVersionUID = 6295951740865457514L;

   /**
   * Constructs an CreateException with no detail message. 
   */
   public CreateException()
   {
      super();
   }

  /**
   * Constructs an CreateException with the specified detail message.
   *
   * @param message - The detailed message
   */
  public CreateException(String message) {
    super(message);
  }
}
