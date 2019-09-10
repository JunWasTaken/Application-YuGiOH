package p1Code;
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

	public String getPositionCombat() {
		return PositionCombat;
	}

	public void setPositionCombat(String positionCombat) {
		PositionCombat = positionCombat;
	}

	public int getATK() {
		return ATK;
	}

	public void setATK(int aTK) {
		ATK = aTK;
	}

	public int getDEF() {
		return DEF;
	}

	public void setDEF(int dEF) {
		DEF = dEF;
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
