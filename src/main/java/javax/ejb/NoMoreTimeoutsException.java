package javax.ejb;

/**
 * This exception indicates that a calendar-based timer will not result in any more timeouts. 
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
public class NoMoreTimeoutsException extends EJBException
{
   private static final long serialVersionUID = 1L;

   public NoMoreTimeoutsException()
   {
      super();
   }

   public NoMoreTimeoutsException(String message)
   {
      super(message);
   }
}
