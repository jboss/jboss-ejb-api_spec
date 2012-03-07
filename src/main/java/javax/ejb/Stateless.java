package javax.ejb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A stateless session bean must be annotated with the Stateless annotation or
 * denoted in the deployment descriptor as a stateless session bean. If other
 * annotations are applied to the bean class or its members, the Stateless
 * annotation must be used. The bean class does not implement the
 * javax.ejb.SessionBean interface.
 * 
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target(ElementType.TYPE) @Retention(RetentionPolicy.RUNTIME)
   public @interface Stateless
{
   String name() default "";
   String mappedName() default "";
   String description() default "";
}
