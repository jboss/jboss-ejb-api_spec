package javax.ejb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Comment
 *
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target({ElementType.TYPE}) @Retention(RetentionPolicy.RUNTIME)
public @interface Resources
{
   Resource[] value();
}
