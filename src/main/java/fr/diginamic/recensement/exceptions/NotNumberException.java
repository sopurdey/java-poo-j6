/**
 * 
 */
package fr.diginamic.recensement.exceptions;

/** Exception jetée lorsque l'utilisateur saisit autre chose qu'un entier.
 * @author DIGINAMIC
 */
public class NotNumberException extends FunctionalException {

	/** serialVersionUID */
	private static final long serialVersionUID = 2458822524551648234L;

	/** Constructeur
	 * @param message message d'exception
	 */
	public NotNumberException(String message) {
		super(message);
	}

}
