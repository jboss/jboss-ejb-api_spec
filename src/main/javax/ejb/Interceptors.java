/*
 * JBoss, Home of Professional Open Source
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.ejb;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * An interceptor class is denoted using the Interceptor annotation on the bean
 * class with which it is associated. In the case of multiple interceptor
 * classes, the Interceptors annotation is used.
 * 
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 * @version $Revision$
 */
@Target({TYPE}) @Retention(RUNTIME)
   public @interface Interceptors
{
   Class[] value();
}
