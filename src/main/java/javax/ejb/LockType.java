package javax.ejb;

/**
 * Concurrency lock type.
 * <ul>
 * <li>READ : For read-only operations. Allows simultaneous access to 
 *  methods designated as READ, as long as no WRITE lock is held.</li> 
 * <li>WRITE : For write operations. The WRITE lock is exclusive.</li>
 * </ul>
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
public enum LockType {
   READ,
   WRITE
}
