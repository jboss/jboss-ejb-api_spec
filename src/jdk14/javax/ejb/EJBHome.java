/*
 * JBoss, the OpenSource EJB server
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.ejb;

/**
 *
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
public interface EJBHome
{
   String name();
   Class homeInterface();
   Class businessInterface();
   EJBBeanType beanType();
   AccessMode accessMode();
   String jndiName();
}


