/*
 * JBoss, the OpenSource EJB server
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.ejb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE}) @Retention(RetentionPolicy.RUNTIME)
public @interface Column
{
   String name() default "";

   boolean primaryKey() default false;

   boolean unique() default false;

   boolean nullable() default true;

   boolean insertable() default true;

   boolean updatable() default true;

   String columnDefinition() default "";

   String secondaryTable() default "";

   int length() default 255;

   int precision() default 0;

   int scale() default 0;

   boolean specified() default true;
}
