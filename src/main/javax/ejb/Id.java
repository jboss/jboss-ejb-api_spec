//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.ejb;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import static javax.ejb.GeneratorType.*;


/**
 * @author Emmanuel Bernard
 */
@Target({METHOD, FIELD}) @Retention(RUNTIME)
public @interface Id
{
   GeneratorType generate() default NONE;

   String generator() default "";
}
