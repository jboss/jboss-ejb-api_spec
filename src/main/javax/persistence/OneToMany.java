//$Id$
//EJB3 Specification Copyright 2004, 2005 Sun Microsystems, Inc.
package javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import static javax.persistence.FetchType.*;

/**
 * @author Emmanuel Bernard
 */
@Target({METHOD, FIELD}) @Retention(RUNTIME)
public @interface OneToMany {
	String targetEntity() default "";
	CascadeType[] cascade() default {};
	FetchType fetch() default LAZY;
	String mappedBy() default "";
}
