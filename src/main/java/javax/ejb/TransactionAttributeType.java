package javax.ejb;

/**
 * Enum for the types of TransactionAttributes
 * 
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
public enum TransactionAttributeType
{
   MANDATORY,
   REQUIRED,
   REQUIRES_NEW,
   SUPPORTS,
   NOT_SUPPORTED,
   NEVER
}
