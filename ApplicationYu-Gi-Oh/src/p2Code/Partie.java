package p2Code;

import java.util.Scanner;

import p1Code.Match2J;

public class Partie {
	public static Scanner sc = new Scanner(System.in);
	public static void Choice() throws Exception {
		int choix;
		Match2J play;
		do {
			System.out.print("Que voulez-vous faire ?\n1-Faire une partie à 2 joueurs\n2-Vous connecter\n");
			choix=sc.nextInt();
		}while(choix!=1);
		play= new Match2J();
	}
	public static void main(String[] args) throws Exception {
		Choice();
	}

}
