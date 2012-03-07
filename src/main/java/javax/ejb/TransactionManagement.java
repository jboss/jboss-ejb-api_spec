package javax.ejb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The TransactionManagement annotation specifies the transaction management
 * demarcation type of a session bean or message-driven bean. If the
 * TransactionManagement annotation is not specified for a session bean or
 * message-driven bean, the bean is assume to have container managed transaction
 * demarcation.
 * 
 * @author <a href="mailto:bdecoste@jboss.com">William DeCoste</a>
 * @version $Revision$
 */
@Target(ElementType.TYPE) @Retention(RetentionPolicy.RUNTIME)
   public @interface TransactionManagement
{
   TransactionManagementType value() default TransactionManagementType.CONTAINER;
}
