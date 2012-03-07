package javax.ejb;

import java.io.Serializable;

/**
 * The TimerHandle interface is implemented by all EJB timer handles.
 **/
public interface TimerHandle
    extends Serializable
{
   
   /**
    * Obtain a reference to the timer represented by this handle.
    *
    * @return Timer which this handle represents
    *
    * @throws IllegalStateException If this method is invoked while the instance is in
    *                               a state that does not allow access to this method.
    * @throws NoSuchObjectLocalException If invoked on a timer that has expired or has been cancelled.
    * @throws EJBException If this method could not complete due to a system-level failure.
    **/
   public Timer getTimer()
      throws
         IllegalStateException,
         NoSuchObjectLocalException,
         EJBException;
}
