//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.ejb;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.*;

/**
 * @author Emmanuel Bernard
 */
@Target({}) @Retention(RUNTIME)
public @interface DependentAttribute
{
   String name();

   Column[] column() default {};
}
