package javax.ejb;

/**
 * This exception indicates that an attempt was made to perform an illegal loopback 
 * invocation on a Singleton with container-managed concurrency. One possible cause 
 * is a loopback call to a WRITE method where the current thread does not already 
 * hold a WRITE lock. 
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
public class IllegalLoopbackException extends ConcurrentAccessException
{
   private static final long serialVersionUID = 1L;

   public IllegalLoopbackException()
   {
      super();
   }

   public IllegalLoopbackException(String message)
   {
      super(message);
   }
}
