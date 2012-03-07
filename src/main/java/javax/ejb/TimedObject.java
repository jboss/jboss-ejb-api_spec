package javax.ejb;

/**
 * The TimedObject interface contains the callback method that is used
 * to deliver timer expiration notifications. It is implemented by an
 * entity bean or stateless session bean or message-driven bean class.
 **/
public interface TimedObject {
   
   /**
    * Invoked by the EJB container upon timer expiration.
    *
    * @param timer Timer whose expiration caused this notification
    **/
   public void ejbTimeout( Timer timer );
}
