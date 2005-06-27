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
 * An ejbPassivate type of callback marker. The method may be called ejbPassivate,
 * or any signature matching:
 *    public void <METHOD>()
 * 
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 * @version $Revision$
 */
@Target({METHOD}) @Retention(RUNTIME)
public @interface PrePassivate
{
}
