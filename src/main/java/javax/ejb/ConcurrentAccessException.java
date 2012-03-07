package javax.ejb;

/**
 * A ConcurrentAccessException indicates that the client has attempted an invocation on a 
 * stateful session bean while another invocation is in progress.
 *
 * @author <a href="mailto:carlo.dewolf@jboss.com">Carlo de Wolf</a>
 * @version $Revision$
 */
public class ConcurrentAccessException extends EJBException
{
   private static final long serialVersionUID = 1L;

   public ConcurrentAccessException()
   {
      super();
   }

   public ConcurrentAccessException(String message)
   {
      super(message);
   }

   public ConcurrentAccessException(String message, Exception ex)
   {
      super(message, ex);
   }
}
