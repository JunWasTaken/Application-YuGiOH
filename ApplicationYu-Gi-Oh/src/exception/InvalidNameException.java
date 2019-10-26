package exception;

public class InvalidNameException extends Exception{
	public InvalidNameException() {
		System.out.println("Ce pseudo est d�j� pris.\nVeuillez en choisir un autre");
	}
	public InvalidNameException(String message) {
		super(message);
	}
	public InvalidNameException(Throwable cause) {
		super(cause);
	}
}
