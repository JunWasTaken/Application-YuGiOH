package exception;

public class InvalidValuePV extends Exception{
	public InvalidValuePV() {
		System.out.println("Valeur invalide, veuillez saisir une valeur positive ou negative");
	}
	public InvalidValuePV(String message) {
		super(message);
	}
	public InvalidValuePV(Throwable cause) {
		super(cause);
	}
}
