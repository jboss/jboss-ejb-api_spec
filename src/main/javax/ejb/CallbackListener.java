/*
 * JBoss, Home of Professional Open Source
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.ejb;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Used to define a callback listener class is denoted using the
 * CallbackListener annotation on the bean class with which it is associated.
 * Callback methods defined on a bean's listener class have the following
 * signature:
 *    public void <METHOD>(Object)
 * where Object may be declared as the actual bean type, which is the argument
 * passed to the callback method at runtime.
 * 
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 * @version $Revision$
 */
@Target({TYPE}) @Retention(RUNTIME)
   public @interface CallbackListener
{
   Class value(); // fully qualified name of the callback listenerclass
}