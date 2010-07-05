/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
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
