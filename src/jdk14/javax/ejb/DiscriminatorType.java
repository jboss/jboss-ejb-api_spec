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
public class DiscriminatorType extends org.jboss.lang.Enum
{
   public static final DiscriminatorType STRING = new DiscriminatorType("STRING", 0);
   public static final DiscriminatorType CHAR = new DiscriminatorType("CHAR", 1);
   public static final DiscriminatorType INTEGER = new DiscriminatorType("INTEGER", 2);
   private static final DiscriminatorType[] values = {STRING, CHAR, INTEGER};

   private DiscriminatorType(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return values[ordinal];
   }

}
