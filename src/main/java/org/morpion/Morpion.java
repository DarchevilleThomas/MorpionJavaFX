package org.morpion;


public class Morpion {
	private final static int nbColonnes = 3;
	private final static int NBLIGNES = 3;
	private int nbTours;
	private String[][] tableau;
	private String joueur1;
	private String joueur2;
	
	public Morpion() {
		this.tableau = new String[nbColonnes][NBLIGNES];
		for (int i=0;i<nbColonnes;i++) {
			for (int j=0;j<NBLIGNES;j++) {
				this.tableau[i][j] = ".";
			}
		}
		this.joueur1 = "X";
		this.joueur2 = "O";
		this.nbTours = 1;
	}
	
	public int getNbTours() {
		return nbTours;
	}
	
	public void initialiserMorpion() {
		for (int i=0;i<nbColonnes;i++) {
			for (int j=0;j<NBLIGNES;j++) {
				this.tableau[i][j] = ".";
			}
		}
		this.nbTours = 1;
	}

	public void afficherMorpion() {
		for (int i=0;i<nbColonnes;i++) {
			System.out.print("|");
			for (int j=0;j<NBLIGNES;j++) {
				System.out.print(" "+tableau[i][j]+" ");
			}
			System.out.println("|");
		}
		System.out.println(" ");
	}
	
	public void addJeton(int a){
		if (this.tableau[a/3][a%3].equals(".")) {
			if (nbTours%2==0) {
				this.tableau[a/3][a%3] = joueur2;
				nbTours++;
			}
			else {
				this.tableau[a/3][a%3] = joueur1;
				nbTours++;
			}
		}
	}
	
	public boolean tableauRempli() {
		boolean remp = true;
		for (int i=0;i<nbColonnes;i++) {
			for (int j=0;j<NBLIGNES;j++) {
				if (this.tableau[i][j].equals(".")) {
					remp = false;
				}
			}
		}
		return remp;
	}
	
	
	// Vérification win
	
	public boolean winDiagonal() {
		if (!(this.tableau[0][0].equals(".")) && this.tableau[0][0].equals(this.tableau[1][1]) && this.tableau[1][1].equals(this.tableau[2][2])) {
			return true;
		}
		if (!(this.tableau[0][2].equals(".")) && this.tableau[0][2].equals(this.tableau[1][1]) && this.tableau[1][1].equals(this.tableau[2][0])) {
			return true;
		}
		return false;
	}
	
	public boolean winHorizontal() {
		for (int i=0;i<nbColonnes;i++) {
			if (!(this.tableau[i][0].equals(".")) && this.tableau[i][0].equals(this.tableau[i][1]) && this.tableau[i][1].equals(this.tableau[i][2])) {
				return true;
			}
		}
		return false;
	}
	
	public boolean winVertical() {
		for (int i=0;i<NBLIGNES;i++) {
			if (!(this.tableau[0][i].equals(".")) && this.tableau[0][i].equals(this.tableau[1][i]) && this.tableau[1][i].equals(this.tableau[2][i])) {
				return true;
			}
		}
		return false;
	}
	
	public boolean winMorpion() {
		if (this.winVertical()==true || this.winHorizontal()==true || this.winDiagonal()==true) {
			return true;
		}
		return false;
	}
}
	