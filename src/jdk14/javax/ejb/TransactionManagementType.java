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
public class TransactionManagementType extends org.jboss.lang.Enum
{
   public static final TransactionManagementType CONTAINER = new TransactionManagementType("CONTAINER", 0);
   public static final TransactionManagementType BEAN = new TransactionManagementType("BEAN", 1);
   private static final TransactionManagementType[] values = {CONTAINER, BEAN};

   private TransactionManagementType(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return values[ordinal];
   }
}
