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
public class AccessMode implements java.io.Serializable
{
   public static final AccessMode LOCAL = new AccessMode("LOCAL", 0);
   public static final AccessMode REMOTE = new AccessMode("REMOTE", 1);
   public static final AccessMode WEBSERVICE = new AccessMode("WEBSERVICE", 2);

   private final transient String name;
   private final int ordinal;

   private static final AccessMode[] values = {LOCAL, REMOTE, WEBSERVICE};

   private AccessMode(String name, int ordinal)
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
