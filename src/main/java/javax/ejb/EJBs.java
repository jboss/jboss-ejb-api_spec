package javax.ejb;

import javax.ejb.EJB;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The EJBs annotation is used to specify multiple EJB 3.0 session bean
 * references on a bean class.
 *
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target({ElementType.TYPE}) @Retention(RetentionPolicy.RUNTIME)
public @interface EJBs
{
   EJB[] value();
}
