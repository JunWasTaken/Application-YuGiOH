package exception;

public class InvalidPlayerChoice extends Exception{
	public InvalidPlayerChoice() {
		System.out.println("Choix de Joueur Invalide");
	}
	public InvalidPlayerChoice(String message) {
		super(message);
	}
	public InvalidPlayerChoice(Throwable cause) {
		super(cause);
	}
}
