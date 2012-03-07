package javax.ejb;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * Specifies the amount of time a stateful session bean can be idle 
 * ( not receive any client invocations ) before it is eligible 
 * for removal by the container.
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
@Target(TYPE)
@Retention(RUNTIME)
public @interface StatefulTimeout {
   long value();
   
   TimeUnit unit() default TimeUnit.MINUTES;
}
