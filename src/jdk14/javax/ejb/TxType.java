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
public class TxType extends org.jboss.lang.Enum
{
   public static final TxType MANDATORY = new TxType("MANDATORY", 0);
   public static final TxType REQUIRED = new TxType("REQUIRED", 1);
   public static final TxType REQUIRESNEW = new TxType("REQUIRESNEW", 2);
   public static final TxType SUPPORTS = new TxType("SUPPORTS", 3);
   public static final TxType NOTSUPPORTED = new TxType("NOTSUPPORTED", 4);
   public static final TxType NEVER = new TxType("NEVER", 5);

   private static final TxType[] values = {MANDATORY, REQUIRED, REQUIRESNEW, SUPPORTS, NOTSUPPORTED, NEVER};

   private TxType(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return values[ordinal];
   }
}
