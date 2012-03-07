package javax.ejb;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static javax.ejb.ConcurrencyManagementType.CONTAINER;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Declares a Singleton bean's concurrency management type.
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
@Target(TYPE)
@Retention(RUNTIME)
public @interface ConcurrencyManagement {
   ConcurrencyManagementType value() default CONTAINER;
}
