package App;
import java.util.Scanner;
@SuppressWarnings("resource")

public class Joueur{
    protected  static int Numero = 1;
    protected static String ListePseudo[] = {""};
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
    
    public static Joueur createJoueur() {
    	Joueur a = new Joueur();
    	Scanner sc = new Scanner(System.in);
    	Boolean flag = false;
    	System.out.println("Veuillez rentrer un pseudo pour le joueur : ");
        String var = sc.next();
        do {
        	for (int i=0; i<ListePseudo.length ; i++) {
            	if (var == ListePseudo[i]) {
            		flag = true;
            	}
            }
        	if (flag == false)
                a.SetPseudo(var);
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

    public boolean VerificationPseudo(Joueur J2){
        if (this.Pseudo.equals(J2.Pseudo)){
            System.out.println("Ce pseudo est déjà pris （・＿・；)");
            return false;
        }else{
            return true;
        }
    }

    public int GetPV(){
        return this.PV;
    }

    public void ModifPV(int x, String y) {
    	
    	if (y.contains("-"))
        	PV=PV-x;
        else if (y.contains("+"))
        	PV=PV+x;
        else if (y.contains("/"))
        	PV = PV/x;
        else if (y.contains("*") || y.contains("x") || y.contains("X"))
        	PV = PV*x;
        else 
        	System.out.println("Veuillez saisir une opération valide");
    }
    
    public String ToString() {
    	return ("――――――――――――――――――――――――――――――\n"+"Pseudo : "+this.GetPseudo() + "\t PV : "+this.GetPV());
    }

	
    public int getNombreJetons() {
		return NombreJetons;
	}
    
	public void GererJetons() {
    	//TODO : créer fonctions gestion jetons 
		
    }  
}