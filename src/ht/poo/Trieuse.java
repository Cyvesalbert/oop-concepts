package ht.poo;


import java.util.Arrays;
import java.util.Comparator;


public class Trieuse {
   
    public static final Comparator<Etudiant> Par_nom    = new NomOrdre();
    public static final Comparator<Etudiant> Par_section = new SectionOrdre();


    private static class SectionOrdre implements Comparator<Etudiant> {
    	@Override
        public int compare(Etudiant x, Etudiant y) {
             // completer
        	return x.getSection() - y.getSection();
        }
    }
    
    private static class NomOrdre implements Comparator<Etudiant> {
    	@Override
        public int compare(Etudiant x, Etudiant y) {
           // completer
        	return x.getNom().compareToIgnoreCase(y.getNom());
    }

    }
          
          // Ajouter des méthodes  ParNom() et ParSection()
    private static void trierParSection(Etudiant[] etudiants) {
        Arrays.sort(etudiants, Par_section);
    }

    private static void trierParNom(Etudiant[] etudiants) {
        Arrays.sort(etudiants, Par_nom);
    }

   
    public static void main(String[] args) {

       
        Etudiant e = new Etudiant("1897453","John", "Gestion", 3);
		
			
        e.AjouterNote("INF2010", "Structures de données et algorithmes", 4);		
        e.AjouterNote("LOG2810", "Structures discrètes", 5);
        e.AjouterNote("INF2610", "Noyau d'un système d'exploitation", 3);
        System.out.println(e.NoteMoyenne());

        Etudiant john     = new Etudiant("1797453","john","Gestion", 2);
        Etudiant Caroline = new Etudiant("1897053","Caroline", "Informatique", 1);
        Etudiant Antoine  = new Etudiant("1297453","Antoine", "Gestion", 2);
        Etudiant Karl     = new Etudiant("1797433","Karl", "Anglais", 1);
        Etudiant Ahmed    = new Etudiant("1897453","Ahmed", "Gestion", 2);
        Etudiant Sam      = new Etudiant("1977411","Sam", "Espanol", 3);
       
        Etudiant[] etudiants = { john, Caroline, Karl, Ahmed, Sam  };

         // Completer le pseudo-code pour trie les etudiants par nom -section 
        System.out.println("Par le nom ");
        System.out.println("----------");
        trierParNom(etudiants);
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.getNom() + ", " + etudiant.getSection());
        }
        System.out.println("----------");

        
        System.out.println("Par section");
        System.out.println("----------");
        trierParSection(etudiants);
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.getNom() + ", " + etudiant.getSection());
        }
        System.out.println("----------");

       
        Etudiant carlos = new Etudiant("1698853","carlos", "Anglais", 3);
        Etudiant Ines = new Etudiant("1897456","Ines","Informatique", 2);


        System.out.println("carlos == Ines:        " + (carlos == Ines));
        System.out.println("carlos.equals(Ines):   " + (carlos.equals(Ines)));

        

    
    }

}


