package javax.ejb;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * Specifies the amount of time in a given time unit that a concurrent access 
 * attempt on a Singleton session bean should block before timing out. 
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
@Target({METHOD,TYPE})
@Retention(RUNTIME)
public @interface AccessTimeout {
   /**
    * The maximum time to wait for access.
    */
   long value();
   
   TimeUnit unit() default TimeUnit.MILLISECONDS;
}
