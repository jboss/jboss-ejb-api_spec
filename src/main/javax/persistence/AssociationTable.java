//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.persistence;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.persistence.Table;
import javax.persistence.JoinColumn;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

import static java.lang.annotation.ElementType.*;

/**
 * @author Emmanuel Bernard
 */
@Target({METHOD, FIELD})  @Retention(RUNTIME)
public @interface AssociationTable
{
   Table table() default @Table(specified = false);

   JoinColumn[] joinColumns() default {};

   JoinColumn[] inverseJoinColumns() default {};
}
