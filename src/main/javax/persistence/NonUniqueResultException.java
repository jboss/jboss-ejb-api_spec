//$Id$
package javax.persistence;

/**
 * @author Gavin King
 */
public class NonUniqueResultException extends RuntimeException {

	public NonUniqueResultException() {
		super();
	}

	public NonUniqueResultException(String message) {
		super( message );
	}

	public NonUniqueResultException(String message, Throwable cause) {
		super( message, cause );
	}

	public NonUniqueResultException(Throwable cause) {
		super( cause );
	}

}
