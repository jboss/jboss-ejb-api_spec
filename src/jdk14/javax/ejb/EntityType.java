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
public class EntityType
{
   public static final EntityType CMP = new EntityType("CMP", 0);
   public static final EntityType BMP = new EntityType("BMP", 1);

   private final transient String name;
   private final int ordinal;

   private static final EntityType[] values = {CMP, BMP};

   private EntityType(String name, int ordinal)
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
