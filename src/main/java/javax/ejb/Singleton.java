package javax.ejb;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Component-defining annotation for a singleton session bean. 
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
@Target(TYPE)
@Retention(RUNTIME)
public @interface Singleton {
   String description() default "";
   
   /**
    * A product specific name (in JBoss the global JNDI name) that this 
    * session bean should be mapped to. Application servers are not 
    * required to support any particular form or type of mapped name, 
    * nor the ability to use mapped names. The mapped name is product-dependent 
    * and often installation-dependent. No use of a mapped name is portable. 
    */
   String mappedName() default "";
   
   /**
    * The ejb-name of this bean.
    */
   String name() default "";
}
