package exception;

public class CaseNonDisponibleException extends Exception{
	public CaseNonDisponibleException() {
		System.out.println("La case n'est pas vide et ne peux pas accueillir un jeton supplémentaire");
	}
	
	public CaseNonDisponibleException(String m) {
		super(m);
	}
	
	public CaseNonDisponibleException(Throwable cause) {
		super(cause);
	}
}
