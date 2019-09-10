package exception;

public class InvalidChoiceException extends Exception{
	public InvalidChoiceException() {
		System.out.println("Veuillez faire un choix correct svp");
	}
	
	public InvalidChoiceException(String m) {
		super(m);
	}
	
	public InvalidChoiceException(Throwable cause) {
		super(cause);
	}
}
