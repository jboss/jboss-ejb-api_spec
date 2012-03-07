package javax.ejb;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static javax.ejb.LockType.WRITE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Declares a concurrency lock for a singleton method.
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
@Target({METHOD,TYPE})
@Retention(RUNTIME)
public @interface Lock {
   LockType value() default WRITE;
}
