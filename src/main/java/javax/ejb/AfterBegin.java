package javax.ejb;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Designate a stateful session bean method to receive the AfterBegin 
 * Session Synchronization callback. 
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface AfterBegin {

}
