//$Id$
//EJB3 Specification Copyright 2004, 2005 Sun Microsystems, Inc.
package javax.persistence;

import javax.ejb.AccessMode;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.*;
import static java.lang.annotation.ElementType.*;
import static javax.ejb.AccessMode.*;

/**
 * @author Emmanuel Bernard
 */
@Target({METHOD, TYPE, PACKAGE}) @Retention(RUNTIME)
public @interface NamedQuery {
	String name() default "";
	String queryString();
	String resultType() default "";
	AccessMode ejbInterfaceType() default LOCAL;
}
