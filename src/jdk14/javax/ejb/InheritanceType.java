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
public class InheritanceType extends org.jboss.lang.Enum
{
   public static final InheritanceType SINGLE_TABLE = new InheritanceType("SINGLE_TABLE", 0);
   public static final InheritanceType UNION = new InheritanceType("UNION", 1);
   public static final InheritanceType JOINED = new InheritanceType("JOINED", 2);
   private static final InheritanceType[] values = {SINGLE_TABLE, UNION, JOINED};

   private InheritanceType(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return values[ordinal];
   }

}
