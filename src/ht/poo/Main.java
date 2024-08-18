package ht.poo;

public class Main {
	public static void main(String[] args) {		
		Etudiant e = new Etudiant("1897453","John", "Informatique", 3);
		
		e.AjouterNote("INF2010", "Structures de données et algorithmes", 4);		
		e.AjouterNote("LOG2810", "Structures discrètes", 5);
		e.AjouterNote("INF2610", "Noyau d'un système d'exploitation", 3);
		System.out.printf("La note moyenne de %s est: %f", e.getNom(), e.NoteMoyenne());
 
                



	}
}

