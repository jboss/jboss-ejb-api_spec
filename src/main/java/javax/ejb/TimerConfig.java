package javax.ejb;

import java.io.Serializable;

/**
 * TimerConfig is used to specify additional timer configuration settings during timer creation.
 *  <p>
 *  The info object represents a serializable object made available to corresponding timer callbacks.
 *  It is optional and defaults to null.
 *  </p>
 *  <p>
 *  The persistent property determines whether the corresponding timer has a lifetime that spans the JVM in which it was created. 
 *  It is optional and defaults to true.
 *  </p>
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
public class TimerConfig
{
   private Serializable info;

   // Persistent by default 
   private boolean persistent = true;

   public TimerConfig()
   {
      
   }
   
   public TimerConfig(Serializable info, boolean persistent)
   {
      this.info = info;
      this.persistent = persistent;
   }
   
   public Serializable getInfo()
   {
      return info;
   }
   
   public boolean isPersistent()
   {
      return persistent;
   }
   
   public void setInfo(Serializable i )
   {
      this.info = i;
   }
   
   public void setPersistent(boolean p)
   {
      this.persistent = p;
   }
}
