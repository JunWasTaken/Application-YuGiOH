package exception;

public class InvalidValue extends Exception{
	public InvalidValue() {
		System.out.println("Valeur invalide, veuillez saisir une valeur positive ou négative");
	}
	public InvalidValue(String message) {
		super(message);
	}
	public InvalidValue(Throwable cause) {
		super(cause);
	}
}
