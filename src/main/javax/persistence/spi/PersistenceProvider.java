// $Id$
package javax.persistence.spi;

import java.util.Map;

import javax.persistence.EntityManagerFactory;

/**
 * Persistence.createEntityManagerFactory creates a new EntityManagerFactoryProvider of the type
 * specified in the "javax.persistence.provider" setting. This setting is the full class name of the
 * PersistenceProvider to construct. Then, the Persistence class invokes the
 * createEntityManagerFactory method on the provider, with a copy of the map passed to the method
 * Persistence.createEntityManagerFactory(java.util.Map) merged with the contents of the
 * persistence.properties resource, as loaded by the Persistence class. The class that implements
 * this interface must have a public no-arg constructor.
 */
public interface PersistenceProvider {
	/**
	 * Persistence.createEntityManagerFactory
	 */
	public EntityManagerFactory createEntityManagerFactory(Map properties);
}