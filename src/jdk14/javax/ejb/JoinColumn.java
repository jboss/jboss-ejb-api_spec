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
public interface JoinColumn
{
   String name();
   String referencedColumnName();
   boolean primaryKey();
   boolean unique();
   boolean nullable();
   boolean insertable();
   boolean updatable();
   String columnDefinition();
   String secondaryTable();
}
