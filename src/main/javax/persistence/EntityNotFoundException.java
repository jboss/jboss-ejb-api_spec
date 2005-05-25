//$Id$
package javax.persistence;

/**
 * @author Gavin King
 */
public class EntityNotFoundException extends RuntimeException {

	public EntityNotFoundException() {
		super();
	}

	public EntityNotFoundException(String message, Throwable cause) {
		super( message, cause );
	}

	public EntityNotFoundException(String message) {
		super( message );
	}

	public EntityNotFoundException(Throwable cause) {
		super( cause );
	}

}
