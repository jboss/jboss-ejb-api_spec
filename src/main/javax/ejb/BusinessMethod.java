/*
 * JBoss, the OpenSource J2EE webOS
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */

package javax.ejb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <a href="mailto:kabir.khan@jboss.com">Kabir Khan</a>
 * @version $Revision$
 */
@Target(ElementType.METHOD) @Retention(RetentionPolicy.RUNTIME)
public @interface BusinessMethod
{
}