package javax.ejb;

/**
 * Interface used by session beans to interact with the
 * persistence context.
 */
public interface EntityManager {
	/**
	 * Create an instance of Query, for executing an
	 * EJBQL query.
	 * @param ejbqlString an EJBQL query string
	 * @return
	 */
	public Query createQuery(String ejbqlString);
	/**
	 * Create an instance of Query, for executing a
	 * named query (in EJBQL or native SQL).
	 * @param name the name of a query defined in metadata
	 * @return
	 */
	public Query createNamedQuery(String name);

	/**
	 * Find by primary key.
	 * @param entityName
	 * @param primaryKey
	 * @return
	 */
	public Object find(String entityName, Object primaryKey);
    /**
     * Find by primary key.
     * @param entityClass
     * @param primaryKey
     * @return
     */
    public <A> A find(Class<A> entityClass, Object primaryKey);

	/**
	 * Make an instance persistent, using the unqualified
	 * class name as the entity name.
	 * @param entity
	 */
	public void create(Object entity);

	/**
	 * Merge the state of the given entity into the
	 * current persistence context, using the unqualified
	 * class name as the entity name.
	 * @param entity
	 * @return the instance that the state was merged to
	 */
	public <A> A merge(A entity);

	/**
	 * Make the instance transient.
	 * @param entity
	 */
	public void remove(Object entity);
	/**
	 * Refresh the state of the instance from the
	 * database.
	 * @param entity
	 */
	public void refresh(Object entity);
	/**
	 * Evict the instance from the current persistence
	 * context (and second-level cache??)
	 * @param entity
	 */
	public void evict(Object entity);

	/**
	 * Does this instance belong to the current persistence
	 * context?
	 * @param entity
	 * @return
	 */
	public boolean contains(Object entity);

	/**
	 * Synchronize the persistence context with the
	 * underlying database.
	 */
	public void flush();

}

