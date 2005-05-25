//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * @author Emmanuel Bernard
 */
@Target({METHOD, FIELD}) @Retention(RUNTIME)
public @interface Embedded {
	AttributeOverride[] value() default {};
}
