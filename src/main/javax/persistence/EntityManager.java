package javax.persistence;


/**
 * Interface used by session beans to interact with the
 * persistence context.
 *
 * @author <a href="mailto:gavine@hibernate.org">Gavin King</a>
 * @version $Revision$
 */
/**
* Interface used to interact with the persistence context.
*/
public interface EntityManager {
   /**
   * Make an instance managed and persistent, using the unqualified
   * class name as the entity name.
   * @param entity
   * @throws IllegalArgumentException if not an entity
   * or entity is detached
   * @throws TransactionRequiredException if there is
   * no transaction
   */
   public void persist(Object entity);

   /**
   * Merge the state of the given entity into the
   * current persistence context.
   * @param entity
   * @return the instance that the state was merged to
   * @throws IllegalArgumentException if not an entity
   * or entity is in the removed state
   * @throws TransactionRequiredException if there is
   * no transaction
   */
   public <T> T merge(T entity);

   /**
   * Remove the instance.
   * @param entity
   * @throws IllegalArgumentException if not an entity
   * or entity is in the removed or in
   * the detached state
   * @throws TransactionRequiredException if there is
   * no transaction
   */
   public void remove(Object entity);

   /**
   * Find by primary key.
   * @param entityName
   * @param primaryKey
   * @return the found entity instance
   * @throws EntityNotFoundException if the entity does not exist
   * @throws IllegalArgumentException if the first argument does
   * not denote an entity type or the second
   * argument is not a valid type for that
   * entity’s primary key
   */
   public Object find(String entityName, Object primaryKey);

   /**
   * Find by primary key.
   * @param entityClass
   * @param primaryKey
   * @return the found entity instance
   * @throws EntityNotFoundException if the entity does not exist
   * @throws IllegalArgumentException if the first argument does
   * not denote an entity type or the second
   * argument is not a valid type for that
   * entity’s primary key
   */
   public <T> T find(Class<T> entityClass, Object primaryKey);

   /**
   * Synchronize the persistence context with the
   * underlying database.
   * @throws TransactionRequiredException if there is
   * no transaction
   */
   public void flush();

   /**
   * Create an instance of Query for executing an
   * EJBQL query.
   * @param ejbqlString an EJBQL query string
   * @return the new query instance
   * @throws IllegalArgumentException if query string is not valid
   */
   public Query createQuery(String ejbqlString);

   /**
   * Create an instance of Query for executing a
   * named query (in EJBQL or native SQL).
   * @param name the name of a query defined in metadata
   * @return the new query instance
   * @throws IllegalArgumentException if query string is not valid
   */
   public Query createNamedQuery(String name);

   /**
   * Create an instance of Query for executing
   * a native SQL query.
   * @param sqlString a native SQL query string
   * @return the new query instance
   * @throws IllegalArgumentException if query string is not valid
   */
   public Query createNativeQuery(String sqlString);

   /**
   * Create an instance of Query for executing
   * a native SQL query.
   * @param sqlString a native SQL query string
   * @param resultClass the class of the resulting instances
   * @return the new query instance
   * @throws IllegalArgumentException if query string is not valid
   */
   public Query createNativeQuery(String sqlString, Class resultClass);

   /**
   * Create an instance of Query for executing
   * a native SQL query.
   * @param sqlString a native SQL query string
   * @param resultSetMapping the name of the result set mapping
   * @return the new query instance
   * @throws IllegalArgumentException if query string is not valid
   */
   public Query createNativeQuery(String sqlString, String resultSetMapping);

   /**
   * Refresh the state of the instance from the
   * database.
   * @param entity
   * @throws IllegalArgumentException if not an entity
   * or entity is not in managed state
   * @throws TransactionRequiredException if there is
   * no transaction
   */
   public void refresh(Object entity);

   /**
   * Check if the instance belongs to the current persistence
   * context.
   * @param entity
   * @return
   * @throws IllegalArgumentException if not an entity
   * @throws TransactionRequiredException if there is
   * no transaction
   */
   public boolean contains(Object entity);
}