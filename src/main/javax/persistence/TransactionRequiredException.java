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
public class TransactionRequiredException extends RuntimeException
{
   public TransactionRequiredException()
   {
      super();
   }

   public TransactionRequiredException(String s)
   {
      super(s);
   }

}
