package v1Code;
import java.util.ArrayList;
import java.util.Scanner;

import exception.InvalidValue;
@SuppressWarnings({"resource", "unused"})

public class Partie {
	
	public static ArrayList<Joueur> listeJoueur = new ArrayList<Joueur>();
	public static Scanner sc = new Scanner(System.in);
	public static void GestionPV(Joueur J1, Joueur J2) throws InvalidValue{
		String choixJoueur;
		String choixAction;
		int modifPV;
		
		System.out.println("Sur quel profil voulez vous effectuer une action ? (Tapez le pseudo du joueur ou 'J1' ou 'J2' si celui-ci est trop long)");
        choixJoueur = sc.next();

        if (choixJoueur.contains("J1") || choixJoueur.contains(J1.GetPseudo())){
        System.out.println("D'accord que voulez vous faire ? (Tapez l'operation a  effectuer)");
        	modifPV = sc.nextInt();
            J1.ModifPV(modifPV);
        }else{
            System.out.println("D'accord que voulez vous faire ? (Tapez l'operation a  effectuer)");
            modifPV = sc.nextInt();
            J2.ModifPV(modifPV);
        }
	}
	public static void GestionPV(Joueur J1, Joueur J2, Joueur J3, Joueur J4) throws InvalidValue {
        int modifPV;
        String choixJoueur;
        String choixAction;
        Scanner sc = new Scanner(System.in);

		System.out.println("Sur quel profil voulez vous effectuer une action ? (Tapez le pseudo du joueur ou 'J1', 'J2', 'J3', 'J4' si celui-ci est trop long)");
        choixJoueur = sc.next();

        if (choixJoueur.contains("J1") || choixJoueur.contains(J1.GetPseudo())){
        	System.out.println("D'accord que voulez vous faire ? (Tapez l'operation a  effectuer)");
        	modifPV = sc.nextInt();
        	J1.ModifPV(modifPV);

        }else if (choixJoueur.contains("J2") || choixJoueur.contains(J2.GetPseudo())) {
        modifPV = sc.nextInt();
        J2.ModifPV(modifPV);

        }else if (choixJoueur.contains("J3") || choixJoueur.contains(J3.GetPseudo())){
        	System.out.println("D'accord que voulez vous faire ? (Tapez l'operation a  effectuer)");
        	modifPV = sc.nextInt();
        	J3.ModifPV(modifPV);

        }else{
        	System.out.println("D'accord que voulez vous faire ? (Tapez l'operation a  effectuer)");
        	modifPV = sc.nextInt();
        	J4.ModifPV(modifPV);
        }
	}
	public static void GestionHasard() {
		Hasard DontKnowWhatImDoing = new Hasard();
		Scanner sc = new Scanner(System.in);
		int ChoixMenu;
		int Resultat;
		
		System.out.println("TrÃ¨s bien, quelle action voulez-vous effectuer ? \n 1-Lancer de De\n 2-Coin flip ");
		ChoixMenu = sc.nextInt();
		if (ChoixMenu == 1) {
			Resultat = DontKnowWhatImDoing.LancerDe();
			System.out.println("Resultat du lancer de de : "+Resultat);
		}else {
			Resultat = DontKnowWhatImDoing.CoinFlip();
			if (Resultat == 1)
				System.out.println("Le joueur ayant selectionne 'pile' a gagne");
			else
				System.out.println("Le joueur ayant selectionne 'face' a gagne");
		}
			
		
	}
	public static void RegisterPlayer(int i) {
		System.out.println("Veuillez rentrer un pseudo pour le joueur : ");
        String var = sc.next();
        for (int j=0; j<i; j++) {
        	
        }
	}
	public static void DeroulementPartie() throws Exception {
        Hasard Lancer = new Hasard();
        String Pseudo;
        String choixJoueur;
        String choixAction;
        int choixJoueur2;
        int ChoixMenu;
        int Result;
        int modifPV;
         
        System.out.println("Combien de Joueurs vont participer a  la partie ? (2 ou 4)");
        int nbJoueurs = sc.nextInt();
        
    	for (int i=0; i<nbJoueurs; i++) {
    		listeJoueur.add(Joueur.createJoueur());
    	}

        
        do {
        	for (int i=0; i<nbJoueurs; i++) {
        		System.out.println(listeJoueur.get(i).GetPseudo()+" : "+listeJoueur.get(i).GetPV());
            }
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Que voulez-vous faire ? \n 1-Effectuer des actions sur les PVs d'un joueur ? \n 2-Partie Hasard ");
            ChoixMenu = sc.nextInt();
            
            if (ChoixMenu == 1){
            	if (nbJoueurs==2){ 
                	GestionPV(listeJoueur.get(0), listeJoueur.get(1));
                }
                if (nbJoueurs==4){ 
                    GestionPV(listeJoueur.get(0), listeJoueur.get(1), listeJoueur.get(2), listeJoueur.get(3));
                }
            }else if (ChoixMenu == 2){
            	GestionHasard();
            }
        }while ((listeJoueur.get(0).PV!=0) || (listeJoueur.get(0).PV !=0) || (listeJoueur.get(0).PV!=0) || (listeJoueur.get(0).PV!=0)); 
	}
	public static void  main(String args[]) throws Exception{
		DeroulementPartie();
	}
}