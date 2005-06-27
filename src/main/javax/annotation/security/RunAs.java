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
 * The Bean Provider can use the RunAs metadata annotation or the Bean Provider
 * or Application Assembler can use the run-as deployment descriptor element to
 * define a run-as identity for an enterprise bean in the deployment descriptor.
 * The run-as identity applies to the enterprise bean as a whole, that is, to
 * all methods of the enterprise bean’s business, home, component, web service
 * endpoint interfaces, to the message listener methods of a message-driven
 * bean, and to the timeout callback method of an enterprise bean, and all
 * internal methods of the bean that they might in turn call. The value is
 * the security role the bean runs as.
 * 
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target(ElementType.TYPE) @Retention(RetentionPolicy.RUNTIME)
   public @interface RunAs
{
   String value();
}

