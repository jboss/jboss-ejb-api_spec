/*
 * JBoss, the OpenSource EJB server
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.annotation.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target({ElementType.METHOD, ElementType.TYPE}) @Retention(RetentionPolicy.RUNTIME)
public @interface RolesReferenced
{
   String[] value();
}
