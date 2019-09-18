package exception;

public class CaseVideException extends Exception{
	public CaseVideException() {
		System.out.println("la case est vide et n'a rien à supprimer");
	}
	
	public CaseVideException(String m) {
		super(m);
	}
	
	public CaseVideException(Throwable cause) {
		super(cause);
	}
}
