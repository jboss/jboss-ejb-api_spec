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
//@Target(ElementType.TYPE) @Retention(RetentionPolicy.CLASS)
public interface Session 
{
   String name();
}


