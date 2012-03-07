package javax.ejb;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Schedule a timer for automatic creation with a timeout schedule 
 * based on a cron-like time expression. The annotated method is used 
 * as the timeout callback method. 
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
@Target(value=METHOD)
@Retention(value=RUNTIME)
public @interface Schedule {
   String dayOfMonth() default "*";
   
   String dayOfWeek() default "*";
   
   String hour() default "0";
   
   String info() default "";
   
   String minute() default "0";
   
   String month() default "*";
   
   boolean persistent() default true;
   
   String second() default "0";
   
   String timezone() default "";
   
   String year() default "*";
}
