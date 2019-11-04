package exception;

public class InvalidPlayerChoiceException extends Exception{
	public InvalidPlayerChoiceException() {
		System.out.println("Veuillez faire un choix correct svp");
	}
	
	public InvalidPlayerChoiceException(String m) {
		super(m);
	}
	
	public InvalidPlayerChoiceException(Throwable cause) {
		super(cause);
	}
}
