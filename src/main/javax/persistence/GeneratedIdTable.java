//$Id$
//EJB3 Specification Copyright 2004, 2005 Sun Microsystems, Inc.
package javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * @author Emmanuel Bernard
 */
@Target({PACKAGE, TYPE}) @Retention(RUNTIME)
public @interface GeneratedIdTable {
	String name() default "";
	Table table() default @Table(specified=false);
	String pkColumnName() default "";
	String valueColumnName() default "";
}
