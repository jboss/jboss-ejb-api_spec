package javax.ejb;

/**
 * This exception indicates that an attempt to concurrently 
 * access a bean method resulted in a timeout.
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @see AccessTimeout
 * @since 3.1
 */
public class ConcurrentAccessTimeoutException extends ConcurrentAccessException
{
   private static final long serialVersionUID = 1L;

   public ConcurrentAccessTimeoutException()
   {
      super();
   }

   public ConcurrentAccessTimeoutException(String message)
   {
      super(message);
   }
}
