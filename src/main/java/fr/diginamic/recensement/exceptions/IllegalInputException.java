/**
 * 
 */
package fr.diginamic.recensement.exceptions;

/** Exception jetée lorsque l'utilisateur saisit des nombres incohérents
 * @author DIGINAMIC
 */
public class IllegalInputException extends FunctionalException {

	/** serialVersionUID */
	private static final long serialVersionUID = 2458822524551648234L;

	/** Constructeur
	 * @param message message d'exception
	 */
	public IllegalInputException(String message) {
		super(message);
	}

}
