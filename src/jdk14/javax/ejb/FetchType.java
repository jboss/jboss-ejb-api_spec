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
public class FetchType extends org.jboss.lang.Enum
{
   public static final FetchType LAZY = new FetchType("LAZY", 0);
   public static final FetchType EAGER = new FetchType("EAGER", 1);
   private static final FetchType[] values = {LAZY, EAGER};

   private FetchType(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return values[ordinal];
   }
}
