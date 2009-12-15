/*
* JBoss, Home of Professional Open Source
* Copyright 2005, JBoss Inc., and individual contributors as indicated
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
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
    * @param info Application information to be delivered along with the timer 
    *   expiration. This can be null.
    * @return The newly created Timer.
    * @throws IllegalArgumentException If Schedule represents an invalid schedule
    *   expression.
    * @throws IllegalStateException If this method is invoked while the instance
    *   is in a state that does not allow access to this method. 
    * @throws EJBException If this method could not complete due to a system-level failure.
    * @since 3.1
    */
   Timer createCalendarTimer(ScheduleExpression schedule, Serializable info)
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
   public Collection getTimers()
      throws
         IllegalStateException,
         EJBException;
}
