package ht.adt;

import java.util.Random;

public class Compteur implements Comparable<Compteur> {

    private final String nom;        // nom du compteur
    private int compteur = 0;        // initialisation la valeur courant est 0

    
    public Compteur(String id) {
		this.nom = "";
         // completer
    } 

   
    public void increment() {
         // completer
    } 

   
    public int score() {
		return compteur;
         // completer
    } 

   
    public String toString() {
		return nom;
         // completer
    } 

  
    public int compareTo(Compteur x) {
		return compteur;
                 // completer
    }
    
	
      
        private static Random random=new Random(10000);
    
      //Retourne un nombre entier aléatoire uniformément dans [0,n[
	 public static int uniform(int n) {
		return n;
	                         // completer
	    }


   
    public static void main(String[] args) { 
        int n = 6;
        int essais = 60000;

        // Creation n compteurs
       
 
         // incrémente les compteurs d'essais au hasard
        

        // Affichage des resultat
        
        }
    } 

