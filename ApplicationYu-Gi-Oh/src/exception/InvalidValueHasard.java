package exception;

public class InvalidValueHasard extends Exception{
	public InvalidValueHasard() {
		System.out.println("Valeur invalide, veuillez choisir entre 1 ou 2");
	}
	public InvalidValueHasard(String message) {
		super(message);
	}
	public InvalidValueHasard(Throwable cause) {
		super(cause);
	}
}
