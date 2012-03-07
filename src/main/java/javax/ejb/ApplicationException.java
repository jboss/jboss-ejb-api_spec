package javax.ejb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for identifying an Exception class as an Application Exception, which does not cause
 * a transaction rollback
 *
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationException
{
   /**
    * Indicates whether the application exception designation should apply to subclasses of 
    * the annotated exception class.
    * @since 3.1
    */
   boolean inherited() default true;
   
   /**
    * Indicates whether the container should cause the transaction to rollback when the 
    * exception is thrown. 
    */
   boolean rollback() default false;
}
