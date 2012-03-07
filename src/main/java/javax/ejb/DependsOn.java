package javax.ejb;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Used to express an initialization dependency between Singleton components.
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
@Target(TYPE)
@Retention(RUNTIME)
public @interface DependsOn {
   /**
    * Holds one or more ejb-names of Singleton components whose 
    * initialization must occur before this Singleton.
    */
   String[] value();
}
