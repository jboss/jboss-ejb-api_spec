//$Id$
package javax.persistence;

public interface EntityTransaction {
    /**
     * Start a resource transaction. This can only be invoked if isActive()
     * is false.
     */
    public void begin();

    /**
     * Commit the current transaction, writing any un-flushed changes to 
     * the database.  This can only be invoked if isActive() is true.
     */
    public void commit();

    /**
     * Roll back the current transaction, discarding any changes that 
     * have happened in this transaction. This can only be invoked if 
     * isActive() is true.
     *
     */
    public void rollback();

    /**
     * Check to see if a transaction is in progress.
     */
    public boolean isActive();
}
