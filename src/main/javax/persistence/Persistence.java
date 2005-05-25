// $Id$
package javax.persistence;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.persistence.spi.PersistenceProvider;

/**
 * Bootstrap class that provides access to an EntityManagerFactory.
 */
public class Persistence {
	/**
	 * Symbolic constant used by calls to createEntityManagerFactory methods to look up the
	 * implementation to load.
	 */
	public static final String PROVIDER_NAME = "javax.persistence.provider";

	/**
	 * Create an EntityManagerFactory. This looks through the following locations for a key called
	 * "javax.persistence.provider" that identifies which implementation should be created: 1.
	 * contents of the Map parameter to this method call 2. applet environment 3. system environment
	 * 4. the contents of persistence.properties, as loaded by a call to
	 * ClassLoader.getResourceAsStream, using the loader returned by Thread.getContextClassLoader.
	 * This search path is only used for looking up the setting of javax.persistence.provider; any
	 * vendor-defined settings will be looked up via means defined by the vendor.
	 */
	public static EntityManagerFactory createEntityManagerFactory(Map userMap) {
		Properties props = loadProperties();

		Map result = new HashMap();
		result.putAll( System.getProperties() );
		result.putAll( props );
		result.putAll( userMap );

		PersistenceProvider emfp = getProvider( result );

		return emfp.createEntityManagerFactory( result );
	}

	private static PersistenceProvider getProvider(Map result) {
		String providerName = (String) result.get( PROVIDER_NAME );
		if ( providerName == null ) {
			throw new IllegalArgumentException( "no persistence provider set" );
		}
		PersistenceProvider emfp;
		try {
			emfp = (PersistenceProvider) Class.forName( providerName ).newInstance();
		}
		catch (Exception e) {
			throw new RuntimeException( "could not create provider: " + providerName, e );
		}
		return emfp;
	}

	private static Properties loadProperties() {
		Properties props = new Properties();
		InputStream stream = Persistence.class.getResourceAsStream( "/persistence.properties" );
		if ( stream != null ) {
			try {
				props.load( stream );
			}
			catch (Exception e) {
				throw new RuntimeException( "could not load persistence.properties" );
			}
			finally {
				try {
					stream.close();
				}
				catch (IOException ioe) {
				}
			}
		}
		return props;
	}

	/**
	 * Create an EntityManagerFactory. This uses the same means as
	 * createEntityManagerFactory(java.util.Map), except that no Map parameter is provided.
	 */
	public static EntityManagerFactory createEntityManagerFactory() {
		return createEntityManagerFactory( Collections.EMPTY_MAP );
	}
}
