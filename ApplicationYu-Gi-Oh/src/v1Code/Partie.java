package v1Code;
import java.util.ArrayList;
import java.util.Scanner;

import exception.InvalidValue;
@SuppressWarnings({"resource", "unused"})

public class Partie {
	
	public static ArrayList<Joueur> listeJoueur = new ArrayList<Joueur>();

	public static void GestionPV(Joueur J1, Joueur J2) throws InvalidValue{
		String choixJoueur;
		String choixAction;
		int modifPV;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sur quel profil voulez vous effectuer une action ? (Tapez le pseudo du joueur ou 'J1' ou 'J2' si celui-ci est trop long)");
        choixJoueur = sc.next();

        if (choixJoueur.contains("J1") || choixJoueur.contains(J1.GetPseudo())){
        System.out.println("D'accord que voulez vous faire ? (Tapez l'opération à effectuer)");
        	modifPV = sc.nextInt();
            J1.ModifPV(modifPV);
        }else{
            System.out.println("D'accord que voulez vous faire ? (Tapez l'opération à effectuer)");
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
        	System.out.println("D'accord que voulez vous faire ? (Tapez l'opération à effectuer)");
        	modifPV = sc.nextInt();
        	J1.ModifPV(modifPV);

        }else if (choixJoueur.contains("J2") || choixJoueur.contains(J2.GetPseudo())) {
        modifPV = sc.nextInt();
        J2.ModifPV(modifPV);

        }else if (choixJoueur.contains("J3") || choixJoueur.contains(J3.GetPseudo())){
        	System.out.println("D'accord que voulez vous faire ? (Tapez l'opération à effectuer)");
        	modifPV = sc.nextInt();
        	J3.ModifPV(modifPV);

        }else{
        	System.out.println("D'accord que voulez vous faire ? (Tapez l'opération à effectuer)");
        	modifPV = sc.nextInt();
        	J4.ModifPV(modifPV);
        }
	}
	public static void GestionJeton(Joueur J1, Joueur J2) {
		Jeton a = new Jeton();
		Scanner sc = new Scanner(System.in);
		String choixJoueur;
		int ChoixMenu;
		int Resultat;
		System.out.println("Sur quel profil voulez vous effectuer une action ? (Tapez le pseudo du joueur ou 'J1' ou 'J2' si celui-ci est trop long)");
        choixJoueur = sc.nextLine();

        if (choixJoueur.contains("J1") || choixJoueur.contains(listeJoueur.get(0).GetPseudo())){
        	System.out.println("Que voulez-vous faire ?\n ⓵-Voir vos Jetons\n ②-Ajouter/Supprimer un ou des jetons\n");
    		ChoixMenu = sc.nextInt();
    		if (ChoixMenu == 1) {
    			for (int i=0; i<J1.NombreJetons; i++) {
    			}
    		}else {
    			System.out.println();
    			J1.GererJetons();
    		}
        }
	}
	public static void GestionHasard() {
		Hasard DontKnowWhatImDoing = new Hasard();
		Scanner sc = new Scanner(System.in);
		int ChoixMenu;
		int Resultat;
		
		System.out.println("Très bien, quelle action voulez-vous effectuer ? \n ⓵-Lancer de Dé ⊡ \n ②-Coin flip ⥁");
		ChoixMenu = sc.nextInt();
		if (ChoixMenu == 1) {
			Resultat = DontKnowWhatImDoing.LancerDe();
			System.out.println("Résultat du lancer de dé : "+Resultat);
		}else {
			Resultat = DontKnowWhatImDoing.CoinFlip();
			if (Resultat == 1)
				System.out.println("Le joueur ayant sélectionné 'pile' a gagné");
			else
				System.out.println("Le joueur ayant sélectionné 'face' a gagné");
		}
			
		
	}
	public static void  main(String args[]) throws Exception{

        Scanner sc = new Scanner(System.in);
        Hasard Lancer = new Hasard();
        String Pseudo;
        String choixJoueur;
        String choixAction;
        int choixJoueur2;
        int ChoixMenu;
        int Result;
        int modifPV;
         
        System.out.println("Combien de Joueurs vont participer à la partie ? (2 ou 4)");
        int nbJoueurs = sc.nextInt();
        
    	for (int i=0; i<nbJoueurs; i++)
    		listeJoueur.add(Joueur.createJoueur());

        
        do {
        	for (int i=0; i<nbJoueurs; i++) {
        		System.out.println(listeJoueur.get(i).GetPseudo()+" : "+listeJoueur.get(i).GetPV());
            }
            System.out.println("――――――――――――――――――――――――――――――");
            System.out.println("Que voulez-vous faire ? \n ①-placer des jetons ? \n ②-Effectuer des actions sur les PVs d'un joueur ? \n"
            		+ " ③-Partie Hasard ");
            ChoixMenu = sc.nextInt();
            
            if (ChoixMenu == 1){
            	if (nbJoueurs == 2)
            		GestionJeton(listeJoueur.get(0), listeJoueur.get(1));
            }else if (ChoixMenu == 2){
                if (nbJoueurs==2){ // gère la fonctions concernant l'ajout ou la diminutions des PVs sur une partie à 2 joueurs
                	GestionPV(listeJoueur.get(0), listeJoueur.get(1));
                }

                if (nbJoueurs==4){ //gère la fonctions concernant l'ajout ou la suppression des PVs sur une partie de 4 joueurs 
                    GestionPV(listeJoueur.get(0), listeJoueur.get(1), listeJoueur.get(2), listeJoueur.get(3));
                }
            }else if (ChoixMenu == 3) {
            	GestionHasard();
            }
        }while ((listeJoueur.get(0).PV!=0) || (listeJoueur.get(0).PV !=0) || (listeJoueur.get(0).PV!=0) || (listeJoueur.get(0).PV!=0)); 
    }
}