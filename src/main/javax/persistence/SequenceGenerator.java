//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.persistence;


/**
 * @author Emmanuel Bernard
 */
public @interface SequenceGenerator
{
   String name();

   String sequenceName() default "ID_SEQ";

   int initialValue() default 0;

   int allocationSize() default 50;
}
