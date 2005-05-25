//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import static javax.persistence.AccessType.*;


/**
 * @author Emmanuel Bernard
 */
@Target({TYPE}) @Retention(RUNTIME)
public @interface Embeddable {
	AccessType access() default PROPERTY;
}
