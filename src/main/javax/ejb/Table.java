//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.ejb;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * @author Emmanuel Bernard
 */
@Target({TYPE}) @Retention(RUNTIME)
public @interface Table
{
   String name() default "";

   String catalog() default "";

   String schema() default "";

   UniqueConstraint[] uniqueConstraints() default {};

   boolean specified() default true; // For internal use only
}
