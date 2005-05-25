//$Id$
package javax.persistence;

import javax.naming.Referenceable;

public interface EntityManagerFactory extends Referenceable {
    /**
     * Create a new EntityManager of PersistenceContextType.TRANSACTION.
     *
     * The isOpen method will return true on the returned instance.
     *
     * This method returns a new EntityManager instance (with a new
     * persistence context) every time it is invoked. 
     */
    EntityManager createEntityManager();

    /**
     * Create a new EntityManager of the specified PersistenceContextType.
     *
     * The isOpen method will return true on the returned instance.
     *
     * This method returns a new EntityManager instance (with a new
     * persistence context) every time it is invoked. 
     */
    EntityManager createEntityManager(PersistenceContextType type);

    /**
     * Get the EntityManager bound to the current JTA transaction.
     *
     * If there is no persistence context bound to the current
     * JTA transaction, a new persistence context is created and
     * associated with the transaction.

     * If there is an existing persistence context bound to
     * the current JTA transaction, it is returned.
     *
     * If no JTA transaction is in progress, an EntityManager instance
     * is created that will be bound to subsequent JTA transactions.
     *
     */
    EntityManager getEntityManager();

    /**
     * Close this factory, releasing any resources that might be 
     * held by this factory. After invoking this method, all methods
     * on the EntityManagerFactory instance will throw an
     * IllegalStateException, except for isOpen, which will return
     * false.
     */
    void close();

    /**
     * Indicates whether or not this factory is open. Returns true
     *  until a call to close has been made.
     */
    public boolean isOpen();
}
