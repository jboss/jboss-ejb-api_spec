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
 * The PostConstruct method is invoked on the newly constructed instance, after
 * any dependency injection has been performed by the container and before the
 * first business method is invoked on the bean.
 * 
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 * @version $Revision$
 */
@Target({METHOD}) @Retention(RUNTIME)
   public @interface PostConstruct
{
}
