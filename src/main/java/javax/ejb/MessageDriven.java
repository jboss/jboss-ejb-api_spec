package javax.ejb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The MessageDriven annotation specifies that the enterprise bean is a
 * message-driven bean. This annotation is applied to the bean class.
 * 
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target(ElementType.TYPE) @Retention(RetentionPolicy.RUNTIME)
   public @interface MessageDriven
{
   String name() default "";
   Class messageListenerInterface() default Object.class;
   ActivationConfigProperty[] activationConfig() default {};
   String mappedName() default "";
   String description() default "";
}
