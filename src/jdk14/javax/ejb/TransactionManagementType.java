/*
 * JBoss, the OpenSource EJB server
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.ejb;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
public class TransactionManagementType implements java.io.Serializable
{
   public static final TransactionManagementType CONTAINER = new TransactionManagementType("CONTAINER", 0);
   public static final TransactionManagementType BEAN = new TransactionManagementType("BEAN", 1);


   private final transient String name;
   private final int ordinal;

   private static final TransactionManagementType[] values = {CONTAINER, BEAN};

   private TransactionManagementType(String name, int ordinal)
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
