package javax.persistence;

import javax.ejb.LobType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static javax.persistence.FetchType.LAZY;

/**
 * Comment
 *
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target({METHOD, FIELD})
@Retention(RUNTIME)
public @interface Lob
{
   FetchType fetch() default LAZY;

   LobType type() default LobType.BLOB;
}
