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
public class GeneratorType extends org.jboss.lang.Enum
{
   public static final GeneratorType ASSIGNED = new GeneratorType("ASSIGNED", 0);
   public static final GeneratorType TABLE = new GeneratorType("TABLE", 1);
   public static final GeneratorType SEQUENCE = new GeneratorType("SEQUENCE", 2);
   public static final GeneratorType IDENTITY = new GeneratorType("IDENTITY", 3);
   public static final GeneratorType AUTO = new GeneratorType("AUTO", 4);
   private static final GeneratorType[] values = {ASSIGNED, TABLE, SEQUENCE, IDENTITY, AUTO};

   private GeneratorType(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return values[ordinal];
   }
}
