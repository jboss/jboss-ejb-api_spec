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
public class FlushModeType extends org.jboss.lang.Enum
{
   public static final FlushModeType COMMIT = new FlushModeType("COMMIT", 0);
   public static final FlushModeType AUTO = new FlushModeType("AUTO", 1);
   public static final FlushModeType NEVER = new FlushModeType("NEVER", 2);
   private static final FlushModeType[] values = {COMMIT, AUTO, NEVER};

   private FlushModeType(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return values[ordinal];
   }

}
