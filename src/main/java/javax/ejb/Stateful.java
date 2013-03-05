package javax.ejb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A stateful session bean must be annotated with the Stateful annotation or
 * denoted in the deployment descriptor as a stateful session bean. If other
 * annotations are applied to the bean class or its members, the Stateful
 * annotation must be used. The bean class does not implement the
 * javax.ejb.SessionBean interface.
 * 
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target(ElementType.TYPE) @Retention(RetentionPolicy.RUNTIME)
   public @interface Stateful
{
   String name() default "";
   String mappedName() default "";
   String description() default "";

   /**
    * Specifies whether this stateful session bean is passivation capable
    *
    * @since EJB 3.2
    */
   boolean passivationCapable() default true;
}

