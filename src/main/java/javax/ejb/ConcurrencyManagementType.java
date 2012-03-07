package javax.ejb;

/**
 * Concurrency management type for a singleton or stateful session bean. 
 * Bean-managed concurrency only applies to singletons. 
 *  
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
public enum ConcurrencyManagementType {
   BEAN, 
   CONTAINER

}
