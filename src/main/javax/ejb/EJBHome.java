/*
 * JBoss, the OpenSource EJB server
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.ejb;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER}) @Retention(RetentionPolicy.RUNTIME)
public @interface EJBHome
{
   String name() default "";
   Class homeInterface() default java.lang.Object.class;
   Class businessInterface() default java.lang.Object.class;
   EJBBeanType beanType() default EJBBeanType.SESSION;
   AccessMode accessMode() default AccessMode.LOCAL;
   String jndiName() default "";
}
