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
public class AuthorizationType implements java.io.Serializable
{
   public static final AuthorizationType CONTAINER = new AuthorizationType("CONTAINER", 0);
   public static final AuthorizationType APPLICATION = new AuthorizationType("APPLICATION", 1);

   private final transient String name;
   private final int ordinal;

   private static final AuthorizationType[] values = {CONTAINER, APPLICATION};

   private AuthorizationType(String name, int ordinal)
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
