package p1Code;
import java.util.Scanner;
import exception.InvalidValuePV;
import exception.InvalidNameException;
@SuppressWarnings("resource")

public class Joueur{
    protected String Pseudo;
    protected int PV;
    protected int NombreJetons;
    protected terrain Terrain;

    public Joueur(){
        PV=8000;
        Pseudo=null;
        Terrain = new terrain();
    }
    
    public Joueur createJoueur() throws InvalidNameException{
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Veuillez rentrer un pseudo pour le joueur : ");
        String var = sc.next();
        this.SetPseudo(var);
        return this;
    }

	public void  SetPseudo(String x){
        this.Pseudo = x;
    }

    public String GetPseudo(){
        return this.Pseudo;
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

    public void ModifPV(int x) throws InvalidValuePV {
    	this.PV = this.PV+x;
    }
    
    public String ToString() {
    	return ("Pseudo : "+this.GetPseudo() + "\t PV : "+this.GetPV());
    }
	
    public int getNombreJetons() {
		return NombreJetons;
	}

	public terrain getTerrain() {
		return Terrain;
	}
  
    
}