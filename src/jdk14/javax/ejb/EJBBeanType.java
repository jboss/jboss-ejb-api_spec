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
public class EJBBeanType extends org.jboss.lang.Enum
{
   public static final EJBBeanType SESSION = new EJBBeanType("SESSION", 0);
   public static final EJBBeanType ENTITY = new EJBBeanType("ENTITY", 1);
   private static final EJBBeanType[] values = {SESSION, ENTITY};

   private EJBBeanType(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return EJBBeanType.values[ordinal];
   }

}
