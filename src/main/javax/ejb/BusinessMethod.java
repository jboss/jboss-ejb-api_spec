/*
 * JBoss, Home of Professional Open Source
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
 * By default, when generating interfaces, all public methods other than
 * injection methods of the bean class will be on the generated interface. This
 * default can be overridden by using the BusinessMethod annotation to
 * explicitly specify those public methods that are to be part of the business
 * interface. If the BusinessMethod annotation is used, only the methods to
 * which it is applied will be part of the generated business interface.
 * 
 * @author <a href="mailto:kabir.khan@jboss.com">Kabir Khan</a>
 * @version $Revision$
 */
@Target(ElementType.METHOD) @Retention(RetentionPolicy.RUNTIME)
   public @interface BusinessMethod
{
}