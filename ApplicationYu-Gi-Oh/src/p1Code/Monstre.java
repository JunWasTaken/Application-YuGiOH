package p1Code;

import java.util.Scanner;

public class Monstre{
    protected String PositionCombat;
    protected int ATK;
    protected int DEF;
    protected int Niveau;
    protected String Nom;
    protected String Type;
    protected String Attribut;
    protected Boolean Effet;
    protected int Colonne;
    protected int Ligne;

	public Monstre(){
        PositionCombat = "Attaque";
        ATK = 0;
        DEF = 0;
        Niveau = 1;
        Nom = " ";
        Type = " ";
        Attribut = " ";
        Effet = false;
    }

    public Monstre (String position, int atk, int def, int lvl, String nom, String type, String attribut, boolean effet){
        PositionCombat = position;
        ATK = atk;
        DEF = def;
        Niveau = lvl;
        Nom = nom; 
        Type = type;
        Attribut = attribut;
        Effet = effet;
    }
    
    public Monstre CreationMonstre() throws Exception{
    	Scanner sc = new Scanner(System.in);
    	int choixPos, lvl, atk, def;
    	String Token;
    	Monstre x = new Monstre();
    	
    	System.out.print("En quelle position voulez-vous invoquer ce monstre :\n1-Attaque\n2-Defense\nChoix : ");
    	choixPos=sc.nextInt();
		System.out.print("\n");
		
    	while(choixPos!=1 && choixPos!=2){
    		System.out.print("Merci de faire un choix valide : ");
    		choixPos=sc.nextInt();
    		System.out.print("\n");
    	}
    	
    	if (choixPos==1)
    		this.setPositionCombat("Attaque");
    	else 
    		this.setPositionCombat("Defense");
    	
    	System.out.print("Veuillez saisir un nom pour le token : ");
    	this.setNom(Token = sc.next());
    	System.out.println(this.getNom());
    	
    	System.out.print("Saisir un Attribut pour le token : ");
    	this.setAttribut(Token = sc.next());
    	
    	System.out.print("Saisir des stats d'attaque puis de d�fense pour le token : ");
    	this.setStats(atk=sc.nextInt(), def=sc.nextInt());
    	return x;
    }
    
	public String getPositionCombat() {
		return PositionCombat;
	}

	public void setPositionCombat(String positionCombat) {
		PositionCombat = positionCombat;
	}

	public int getATK() {
		return ATK;
	}

	public void setStats(int aTK, int def) {
		ATK = aTK;
		DEF = def;
	}

	public int getDEF() {
		return DEF;
	}

	public int getNiveau() {
		return Niveau;
	}

	public void setNiveau(int niveau) {
		Niveau = niveau;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getAttribut() {
		return Attribut;
	}

	public void setAttribut(String attribut) {
		Attribut = attribut;
	}

	public Boolean getEffet() {
		return Effet;
	}

	public void setEffet(Boolean effet) {
		Effet = effet;
	}

	public int getColonne() {
		return Colonne;
	}

	public void setColonne(int colonne) {
		Colonne = colonne;
	}

	public int getLigne() {
		return Ligne;
	}

	public void setLigne(int ligne) {
		Ligne = ligne;
	}
    
    public String toString() {
    	return ("Nom : "+this.getNom());
    }
}
