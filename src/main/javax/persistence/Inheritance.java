//$Id$
//EJB3 Specification Copyright 2004, 2005 Sun Microsystems, Inc.
package javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import static javax.persistence.InheritanceType.*;
import static javax.persistence.DiscriminatorType.*;

/**
 * @author Emmanuel Bernard
 */
@Target({TYPE}) @Retention(RUNTIME)
public @interface Inheritance {
	InheritanceType strategy() default SINGLE_TABLE;
	DiscriminatorType discriminatorType() default STRING;
	String discriminatorValue() default "";
}
