/*
 * JBoss, Home of Professional Open Source
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.ejb;



/**
 * Annotation for adding properties to messaging bean annotations (i.e. @MessageDriven, @Consumer)
 * 
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
public @interface ActivationConfigProperty
{
   String propertyName();

   String propertyValue();
}
