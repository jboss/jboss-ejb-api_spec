//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.ejb;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author Emmanuel Bernard
 */
@Target({METHOD, FIELD})
public @interface AssociationTable
{
   Table table() default @Table(specified = false);

   JoinColumn[] joinColumns() default {};

   JoinColumn[] inverseJoinColumns() default {};
}
