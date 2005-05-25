//$Id$
//EJB3 Specification Copyright 2004, 2005 Sun Microsystems, Inc.
package javax.persistence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Emmanuel Bernard
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmbeddedId {
	AttributeOverride[] value() default {};
}
