/*
 * JBoss, the OpenSource EJB server
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.persistence;

/**
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 * @version $Revision$
 */
public class ObjectNotFoundException extends RuntimeException
{
   public ObjectNotFoundException()
   {
      super();
   }

   public ObjectNotFoundException(String s)
   {
      super(s);
   }
}
