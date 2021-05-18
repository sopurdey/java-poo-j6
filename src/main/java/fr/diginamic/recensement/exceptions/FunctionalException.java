/**
 * 
 */
package fr.diginamic.recensement.exceptions;

/** Classe mère de toutes les exceptions utilisées dans l'application de recensement
 * @author DIGINAMIC
 */
public class FunctionalException extends Exception {

	/** serialVersionUID */
	private static final long serialVersionUID = -230573210905498171L;

	/** Constructeur
	 * @param message message d'erreur
	 */
	public FunctionalException(String message) {
		super(message);
	}
}
