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
public class EntityType extends org.jboss.lang.Enum
{
   public static final EntityType CMP = new EntityType("CMP", 0);
   public static final EntityType BMP = new EntityType("BMP", 1);
   private static final EntityType[] values = {CMP, BMP};

   private EntityType(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return values[ordinal];
   }
}
