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
public class TransactionAttributeType implements java.io.Serializable
{
   public static final TransactionAttributeType MANDATORY = new TransactionAttributeType("MANDATORY", 0);
   public static final TransactionAttributeType REQUIRED = new TransactionAttributeType("REQUIRED", 1);
   public static final TransactionAttributeType REQUIRESNEW = new TransactionAttributeType("REQUIRESNEW", 2);
   public static final TransactionAttributeType SUPPORTS = new TransactionAttributeType("SUPPORTS", 3);
   public static final TransactionAttributeType NOTSUPPORTED = new TransactionAttributeType("NOTSUPPORTED", 4);
   public static final TransactionAttributeType NEVER = new TransactionAttributeType("NEVER", 5);

   private final transient String name;
   private final int ordinal;

   private static final TransactionAttributeType[] values = {MANDATORY, REQUIRED, REQUIRESNEW, SUPPORTS, NOTSUPPORTED, NEVER};

   private TransactionAttributeType(String name, int ordinal)
   {
      this.name = name;
      this.ordinal = ordinal;
   }

   public String toString()
   {
      return name;
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return values[ordinal];
   }
}
