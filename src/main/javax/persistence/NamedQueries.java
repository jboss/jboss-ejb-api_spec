/*
 * JBoss, the OpenSource EJB server
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

/**
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 * @version $Revision$
 */
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.PACKAGE}) @Retention(RetentionPolicy.RUNTIME)
public @interface NamedQueries {
   NamedQuery [] value ();
}