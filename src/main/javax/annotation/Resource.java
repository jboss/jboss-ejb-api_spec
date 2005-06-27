/*
 * JBoss, Home of Professional Open Source
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Resource annotation is used to express a dependency on an external
 * resource in the bean’s environment. The name property refers to the name by
 * which the resource is to be known in the environment; the type is the
 * resource manager connection factory type. The authenticationType member
 * specifies whether the container or bean is to perform authentication. The
 * shareable member refers to the sharability of resource manager connections.
 * 
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER}) @Retention(RetentionPolicy.RUNTIME)
   public @interface Resource
{
   String name() default "";

   Class type() default Object.class;

   AuthenticationType authenticationType() default AuthenticationType.CONTAINER;

   boolean shareable() default true;

   String description() default "";

}
