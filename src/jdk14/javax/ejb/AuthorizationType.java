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
public class AuthorizationType extends org.jboss.lang.Enum
{
   public static final AuthorizationType CONTAINER = new AuthorizationType("CONTAINER", 0);
   public static final AuthorizationType APPLICATION = new AuthorizationType("APPLICATION", 1);

   private static final AuthorizationType[] values = {CONTAINER, APPLICATION};

   private AuthorizationType(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return values[ordinal];
   }
}
