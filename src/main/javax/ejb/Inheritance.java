//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.ejb;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import static javax.ejb.InheritanceType.*;
import static javax.ejb.DiscriminatorType.*;

/**
 * @author Emmanuel Bernard
 */
@Target({TYPE}) @Retention(RUNTIME)
public @interface Inheritance
{
   InheritanceType strategy() default SINGLE_TABLE;

   DiscriminatorType discriminatorType() default STRING;

   String discriminatorValue() default "";
}
