/*
 *  JBoss, Home of Professional Open Source
 *  Copyright 2010 Red Hat, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package javax.ejb;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * The TimerService interface provides enterprise bean components with access to the
 * container-provided Timer Service. The EJB Timer Service allows entity beans, stateless
 * session beans, and message-driven beans to be registered for timer callback events at
 * a specified time, after a specified elapsed time, or after a specified interval.
 **/
public interface TimerService {
   
   /**
    * Create a calendar-based timer based on the input schedule expression.
    * 
    * @param schedule A schedule expression describing the timeouts for this timer.
    * @return The newly created Timer.
    * @throws IllegalArgumentException If Schedule represents an invalid schedule
    *   expression.
    * @throws IllegalStateException If this method is invoked while the instance
    *   is in a state that does not allow access to this method. 
    * @throws EJBException If this method could not complete due to a system-level failure.
    * @since 3.1
    */
   Timer createCalendarTimer(ScheduleExpression schedule)
      throws IllegalArgumentException, IllegalStateException, EJBException;
   
   /**
    * Create a calendar-based timer based on the input schedule expression.
    * 
    * @param schedule A schedule expression describing the timeouts for this timer.
    * @param timerConfig Timer configuration.
    * @return The newly created Timer.
    * @throws IllegalArgumentException If Schedule represents an invalid schedule
    *   expression.
    * @throws IllegalStateException If this method is invoked while the instance
    *   is in a state that does not allow access to this method. 
    * @throws EJBException If this method could not complete due to a system-level failure.
    * @since 3.1
    */
   Timer createCalendarTimer(ScheduleExpression schedule, TimerConfig timerConfig)
      throws IllegalArgumentException, IllegalStateException, EJBException;

   /**
    * Create an interval timer whose first expiration occurs at a given point in time and
    * whose subsequent expirations occur after a specified interval.
    *
    * @param initialExpiration The point in time at which the first timer expiration must occur.
    * @param intervalDuration The number of milliseconds that must elapse between timer
    *                         expiration notifications. Expiration notifications are
    *                         scheduled relative to the time of the first expiration. If
    *                         expiration is delayed(e.g. due to the interleaving of other
    *                         method calls on the bean) two or more expiration notifications
    *                         may occur in close succession to "catch up".
    * @param timerConfig Timer configuration.
    *
    * @return The newly created Timer. 
    *
    * @throws IllegalArgumentException If initialExpiration is null, or initialExpiration.getTime()
    *                                  is negative, or intervalDuration is negative.
    * @throws IllegalStateException If this method is invoked while the instance is in
    *                               a state that does not allow access to this method.
    * @throws EJBException If this method could not complete due to a system-level failure.
    * @since 3.1
    **/
   public Timer createIntervalTimer( Date initialExpiration, long intervalDuration, TimerConfig timerConfig )
      throws
         IllegalArgumentException,
         IllegalStateException,
         EJBException;
   
   /**
    * Create an interval timer whose first expiration occurs after a specified duration,
    * and whose subsequent expirations occur after a specified interval.
    *
    * @param initialDuration The number of milliseconds that must elapse before the first
    *                        timer expiration notification.
    * @param intervalDuration The number of milliseconds that must elapse between timer
    *                         expiration notifications. Expiration notifications are
    *                         scheduled relative to the time of the first expiration. If
    *                         expiration is delayed(e.g. due to the interleaving of other
    *                         method calls on the bean) two or more expiration notifications
    *                         may occur in close succession to "catch up".
    * @param timerConfig Timer configuration.
    *
    * @return The newly created Timer. 
    *
    * @throws IllegalArgumentException If initialDuration is negative, or intervalDuration
    *                                  is negative.
    * @throws IllegalStateException If this method is invoked while the instance is in
    *                               a state that does not allow access to this method.
    * @throws EJBException If this method could not complete due to a system-level failure.
    * @since 3.1
    **/
   public Timer createIntervalTimer( long initialDuration, long intervalDuration, TimerConfig timerConfig )
      throws
         IllegalArgumentException,
         IllegalStateException,
         EJBException;
   
   /**
    * Create a single-action timer that expires at a given point in time.
    *
    * @param expiration The point in time at which the timer must expire.
    * @param timerConfig Timer configuration.
    *
    * @return The newly created Timer. 
    *
    * @throws IllegalArgumentException If expiration is null, or expiration.getTime() is negative.
    * @throws IllegalStateException If this method is invoked while the instance is in
    *                               a state that does not allow access to this method.
    * @throws EJBException If this method could not complete due to a system-level failure.
    * @since 3.1
    **/
   public Timer createSingleActionTimer( Date expiration, TimerConfig timerConfig )
      throws
         IllegalArgumentException,
         IllegalStateException,
         EJBException;
   
   /**
    * Create a single-action timer that expires after a specified duration.
    *
    * @param duration  The number of milliseconds that must elapse before the timer expires.
    * @param timerConfig Timer configuration.
    *
    * @return The newly created Timer. 
    *
    * @throws IllegalArgumentException If duration is negative
    * @throws IllegalStateException If this method is invoked while the instance is in
    *                               a state that does not allow access to this method.
    * @throws EJBException If this method could not complete due to a system-level failure.
    * @since 3.1
    **/
   public Timer createSingleActionTimer( long duration, TimerConfig timerConfig )
      throws
         IllegalArgumentException,
         IllegalStateException,
         EJBException;
   
   /**
    * Create a single-action timer that expires after a specified duration.
    *
    * @param duration  The number of milliseconds that must elapse before the timer expires.
    * @param info Application information to be delivered along with the timer expiration
    *             notification. This can be null.
    *
    * @return The newly created Timer. 
    *
    * @throws IllegalArgumentException If duration is negative
    * @throws IllegalStateException If this method is invoked while the instance is in
    *                               a state that does not allow access to this method.
    * @throws EJBException If this method could not complete due to a system-level failure.
    **/
   public Timer createTimer( long duration, Serializable info )
      throws
         IllegalArgumentException,
         IllegalStateException,
         EJBException;
   
   /**
    * Create an interval timer whose first expiration occurs after a specified duration,
    * and whose subsequent expirations occur after a specified interval.
    *
    * @param initialDuration The number of milliseconds that must elapse before the first
    *                        timer expiration notification.
    * @param intervalDuration The number of milliseconds that must elapse between timer
    *                         expiration notifications. Expiration notifications are
    *                         scheduled relative to the time of the first expiration. If
    *                         expiration is delayed(e.g. due to the interleaving of other
    *                         method calls on the bean) two or more expiration notifications
    *                         may occur in close succession to "catch up".
    * @param info Application information to be delivered along with the timer expiration
    *             notification. This can be null.
    *
    * @return The newly created Timer. 
    *
    * @throws IllegalArgumentException If initialDuration is negative, or intervalDuration
    *                                  is negative.
    * @throws IllegalStateException If this method is invoked while the instance is in
    *                               a state that does not allow access to this method.
    * @throws EJBException If this method could not complete due to a system-level failure.
    **/
   public Timer createTimer( long initialDuration, long intervalDuration, Serializable info )
      throws
         IllegalArgumentException,
         IllegalStateException,
         EJBException;
   
   /**
    * Create a single-action timer that expires at a given point in time.
    *
    * @param expiration The point in time at which the timer must expire.
    * @param info Application information to be delivered along with the timer expiration
    *             notification. This can be null.
    *
    * @return The newly created Timer. 
    *
    * @throws IllegalArgumentException If expiration is null, or expiration.getTime() is negative.
    * @throws IllegalStateException If this method is invoked while the instance is in
    *                               a state that does not allow access to this method.
    * @throws EJBException If this method could not complete due to a system-level failure.
    **/
   public Timer createTimer( Date expiration, Serializable info )
      throws
         IllegalArgumentException,
         IllegalStateException,
         EJBException;
   
   /**
    * Create an interval timer whose first expiration occurs at a given point in time and
    * whose subsequent expirations occur after a specified interval.
    *
    * @param initialExpiration The point in time at which the first timer expiration must occur.
    * @param intervalDuration The number of milliseconds that must elapse between timer
    *                         expiration notifications. Expiration notifications are
    *                         scheduled relative to the time of the first expiration. If
    *                         expiration is delayed(e.g. due to the interleaving of other
    *                         method calls on the bean) two or more expiration notifications
    *                         may occur in close succession to "catch up".
    * @param info Application information to be delivered along with the timer expiration
    *             notification. This can be null.
    *
    * @return The newly created Timer. 
    *
    * @throws IllegalArgumentException If initialExpiration is null, or initialExpiration.getTime()
    *                                  is negative, or intervalDuration is negative.
    * @throws IllegalStateException If this method is invoked while the instance is in
    *                               a state that does not allow access to this method.
    * @throws EJBException If this method could not complete due to a system-level failure.
    **/
   public Timer createTimer( Date initialExpiration, long intervalDuration, Serializable info )
      throws
         IllegalArgumentException,
         IllegalStateException,
         EJBException;
   
   /**
    * Get all the active timers associated with this bean.
    *
    * @return A collection of javax.ejb.Timer objects.
    * @throws IllegalStateException If this method is invoked while the instance is in
    *                               a state that does not allow access to this method.
    * @throws EJBException If this method could not complete due to a system-level failure.
    **/
   public Collection<Timer> getTimers()
      throws
         IllegalStateException,
         EJBException;
}
