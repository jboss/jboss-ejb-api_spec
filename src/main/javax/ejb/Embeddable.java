//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.ejb;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import static javax.ejb.AccessType.*;


/**
 * @author Emmanuel Bernard
 */
@Target({TYPE})
@Retention(RUNTIME)
public @interface Embeddable
{
   AccessType access() default PROPERTY;
}
