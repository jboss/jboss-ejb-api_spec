package javax.ejb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to mark a method that will remove a stateful session on completion
 *
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target({ElementType.METHOD}) @Retention(RetentionPolicy.RUNTIME)
public @interface Remove
{
   boolean retainIfException() default false;
}
