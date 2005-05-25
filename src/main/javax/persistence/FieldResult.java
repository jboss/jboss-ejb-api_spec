//$Id$
//EJB3 Specification Copyright 2004, 2005 Sun Microsystems, Inc.
package javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Emmanuel Bernard
 */
@Target({}) @Retention(RetentionPolicy.RUNTIME)
public @interface FieldResult {
	String name();
	String column();
}
