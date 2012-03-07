package javax.ejb;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * The EJB annotation denotes a reference to an EJB 3.0 session bean.
 * 
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Retention(RUNTIME)
@Target({TYPE, METHOD, FIELD}) 
public @interface EJB
{
   String name() default "";

   Class beanInterface() default java.lang.Object.class;
   
   String beanName() default "";
   
   /** 
    * A portable lookup string containing the JNDI name for the target EJB component.
    */
   String lookup() default "";
   
   String mappedName() default "";

   String description() default "";
}
