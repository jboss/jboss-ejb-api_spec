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
public class CascadeType extends org.jboss.lang.Enum
{
   public static final CascadeType ALL = new CascadeType("ALL", 0);
   public static final CascadeType CREATE = new CascadeType("CREATE", 1);
   public static final CascadeType MERGE = new CascadeType("MERGE", 2);
   public static final CascadeType REMOVE = new CascadeType("REMOVE", 3);
   private static final CascadeType[] values = {ALL, CREATE, MERGE, REMOVE};

   private CascadeType(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return values[ordinal];
   }
}
