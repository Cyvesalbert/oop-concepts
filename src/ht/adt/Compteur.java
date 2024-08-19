package ht.adt;

import java.util.Random;

public class Compteur implements Comparable<Compteur> {

    private final String nom;        // nom du compteur
    private int compteur = 0;        // initialisation la valeur courant est 0

    
    public Compteur(String id) {
         // completer
    	this.nom = id;
    } 

   
    public void increment() {
         // completer
    	compteur++;
    } 

   
    public int score() {
         // completer
    	return compteur;
    } 

   
    public String toString() {
         // completer
    	return nom + " : " + compteur;
    } 

    @Override
    public int compareTo(Compteur x) {
        // completer
    	return Integer.compare(this.compteur, x.compteur);
    }
    
    private static Random random = new Random(10000); //Retourne un nombre entier aléatoire uniformément dans [0,n[
    
      
	public static int uniform(int n) {
	    // completer
		return random.nextInt(n);
	}


    public static void main(String[] args) { 
        int n = 6;
        int essais = 60000;

        // Création des n compteurs
        Compteur[] compteurs = new Compteur[n];
        
        for (int i = 0; i < n; i++) {
            compteurs[i] = new Compteur("Compteur " + i);
        }

        // Incrémentation des compteurs d'essais au hasard
        for (int i = 0; i < essais; i++) {
            int index = uniform(n);
            compteurs[index].increment();
        }

        // Affichage des résultats
        for (Compteur c : compteurs) {
            System.out.println(c);
        }
        
        }
    } 

