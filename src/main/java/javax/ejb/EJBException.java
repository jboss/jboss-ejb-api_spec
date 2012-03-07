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

