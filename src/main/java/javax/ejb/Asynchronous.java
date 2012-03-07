package javax.ejb;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Used to mark a method as an asynchronous method or to designate all 
 * business methods of a class or interface as asynchronous. 
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
@Target({METHOD,TYPE})
@Retention(RUNTIME)
public @interface Asynchronous {

}
