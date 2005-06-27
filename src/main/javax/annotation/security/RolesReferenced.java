/*
 * JBoss, Home of Professional Open Source
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
 * The Bean Provider is responsible for using the RolesReferenced metadata
 * annotation or the security-role-ref elements of the deployment descriptor to
 * declare all the security role names used in the enterprise bean code. The
 * values must be the security role name that is used as a parameter to the
 * isCallerInRole(String roleName) method.
 * 
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target({ElementType.TYPE}) @Retention(RetentionPolicy.RUNTIME)
   public @interface RolesReferenced
{
   String[] value();
}
