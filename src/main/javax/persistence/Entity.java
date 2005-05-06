//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.persistence;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static javax.persistence.AccessType.PROPERTY;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Emmanuel Bernard
 */
@Target(TYPE) @Retention(RUNTIME)
public @interface Entity
{
   String name() default "";

   AccessType access() default PROPERTY;

}
