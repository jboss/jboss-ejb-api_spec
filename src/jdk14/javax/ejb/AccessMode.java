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
public class AccessMode extends org.jboss.lang.Enum
{
   public static final AccessMode LOCAL = new AccessMode("LOCAL", 0);
   public static final AccessMode REMOTE = new AccessMode("REMOTE", 1);
   public static final AccessMode WEBSERVICE = new AccessMode("WEBSERVICE", 2);
   private static final AccessMode[] values = {LOCAL, REMOTE, WEBSERVICE};

   private AccessMode(String name, int ordinal)
   {
      super(name, ordinal);
   }

   Object readResolve() throws java.io.ObjectStreamException
   {
      return AccessMode.values[ordinal];
   }

}
