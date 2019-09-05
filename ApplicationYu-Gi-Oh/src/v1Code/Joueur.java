package v1Code;
import java.util.ArrayList;
import java.util.Scanner;
import exception.InvalidValue;
import exception.InvalidNameException;
@SuppressWarnings("resource")

public class Joueur{
    protected  static int Numero = 1;
    protected static ArrayList<String> ListePseudo = new ArrayList<String>();
    protected static int Num;
    protected String Pseudo;
    protected int PV;
    protected int NombreJetons;

    public Joueur(){
        PV=8000;
        Pseudo=null;
        NombreJetons=0;
        Num = (int) Numero;
        Numero+=1;
    }
    
    public static Joueur createJoueur() throws InvalidNameException{
    	Joueur a = new Joueur();
    	Scanner sc = new Scanner(System.in);
    	Boolean flag = false;
    	System.out.println("Veuillez rentrer un pseudo pour le joueur : ");
        String var = sc.next();
        do {
        	for (int i=0; i<ListePseudo.size() ; i++) {
            	if (var == ListePseudo.get(i)) {
            		flag = true;
            		throw new InvalidNameException();
            	}
            }
        	if (flag == false) {
                a.SetPseudo(var);
                ListePseudo.add(var);
        	}
        } while (a.GetPseudo() == null);
        return a;
    }

	public void  SetPseudo(String x){
        this.Pseudo = x;
    }

    public String GetPseudo(){
        return this.Pseudo;
    }

    public int GetNumero(){
        return this.Numero;
    }

    public boolean VerificationPseudo(Joueur J2) throws InvalidNameException{
        if (this.Pseudo.equals(J2.Pseudo)){
            throw new InvalidNameException();
        }else{
            return true;
        }
    }

    public int GetPV(){
        return this.PV;
    }

    public void ModifPV(int x) throws InvalidValue {
    	this.PV = this.PV+x;
    }
    
    public String ToString() {
    	return ("Pseudo : "+this.GetPseudo() + "\t PV : "+this.GetPV());
    }

	
    public int getNombreJetons() {
		return NombreJetons;
	}
    
	public void GererJetons() {
    	//TODO : créer fonctions gestion jetons 
		
    }  
}