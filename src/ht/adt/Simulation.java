package ht.adt;

import java.util.Random;

public class Simulation {
	 private static Random random = new Random();  

	 	//Retourne un nombre réel aléatoire uniformément dans [0,1[
	 public static double uniform() {
	        //completer
			return random.nextDouble();
	  }
	 
	 	//Retourne un nombre entier aléatoire uniformément dans [0,n[
	 public static int uniform(int n) {
	        //completer
			return random.nextInt(n);
	    }

	//Retourne un entier long aléatoire uniformément dans [0, n[.
    // Vous pouviez trouver le code https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#longs-long-long-long-
    public static long uniform(long n) {
        if (n <= 0L) throw new IllegalArgumentException("Argument doit etre positive: " + n);


        long r = random.nextLong();
        long m = n - 1;

        
        if ((n & m) == 0L) {
            return r & m;
        }

      
        long u = r >>> 1;
        while (u + m - (r = u % n) < 0L) {
            u = random.nextLong() >>> 1;
        }
        return r;
    }
    
    //Retourne avec succès un booléen true si p suit d'une distribution de Bernoulli
    public static boolean bernoulli(double p) {
       //completer
    	return uniform() < p;
    }
    
    public static Compteur max(Compteur x, Compteur y) {
      // completer
    	return (x.score() > y.score()) ? x : y;
    }
	
	 public static void main(String[] args) {
	        int n = 10;
	        Compteur pile = new Compteur("pile");
	        Compteur face = new Compteur("face");
	       
	        // Simulation d'un lancer de pièce
			 for (int i = 0; i < n; i++) {
				 if (bernoulli(0.5)) {
					 pile.increment();  // Incrémente si c'est pile
				 } else {
					 face.increment();  // Incrémente si c'est face
				 }
			 }
           
			 // Afficher la différence entre les scores des compteurs
			 System.out.println("Différence entre les scores: " + Math.abs(pile.score() - face.score()));
	        
			// Simuler avec des compteurs supplémentaires et afficher le maximum
			 Compteur pile_c = new Compteur("pile_c");
			 Compteur face_c = new Compteur("face_c");

			 for (int i = 0; i < n; i++) {
				 if (bernoulli(0.5)) {
					 pile_c.increment();
				 } else {
					 face_c.increment();
				 }
			 }

			 // Afficher le maximum entre les scores des compteurs
			 System.out.println("Score maximum : " + max(pile_c, face_c));

	        }
	        
	    }

