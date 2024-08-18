package ht.poo;




import java.util.Arrays;
import java.util.Comparator;


public class Trieuse {
   
    public static final Comparator<Etudiant> Par_nom    = new NomOrdre();
    public static final Comparator<Etudiant> Par_section = new SectionOrdre();


    private static class NomOrdre implements Comparator<Etudiant> {
        public int compare(Etudiant x, Etudiant y) {
           // completer
        }
    }


    private static class SectionOrdre implements Comparator<Etudiant> {
        public int compare(Etudiant x, Etudiant y) {
             // completer
        }
    }

                
          // Ajouter des méthodes  ParNom() et ParSection()

               //completer 

   
    public static void main(String[] args) {

       
        Etudiant e = new Etudiant("1897453","John",3);
		
			
        e.AjouterNote("INF2010", "Structures de données et algorithmes", 4);		
        e.AjouterNote("LOG2810", "Structures discrètes", 5);
        e.AjouterNote("INF2610", "Noyau d'un système d'exploitation", 3);
	System.out.println(e.NoteMoyenne());

        Etudiant john     = new Etudiant("1797453","john",  2);
        Etudiant Caroline = new Etudiant("1897053","Caroline",    1);
        Etudiant Antoine  = new Etudiant("1297453","Antoine",  2);
        Etudiant Karl     = new Etudiant("1797433","Karl",   1);
        Etudiant Ahmed    = new Etudiant("1897453","Ahmed",    2);
        Etudiant Sam      = new Etudiant("1977411","Sam",  3);
       
        Etudiant[] etudiants = {
            john, Caroline, Karl, Ahmed, Sam
        };

         // Completer le pseudo-code pour trie les etudiants par nom -section 
        System.out.println("Par le nom ");
        System.out.println("----------");
               // Completer
        System.out.println("----------");
        



        System.out.println("Par section");
        System.out.println("----------");
                 // Completer
        System.out.println("----------");

       
        Etudiant carlos = new Etudiant("1698853","carlos", 3);
        Etudiant Ines = new Etudiant("1897456","Ines", 2);


        System.out.println("carlos == Ines:        " + (carlos == Ines));
        System.out.println("carlos.equals(Ines):   " + (carlos.equals(Ines)));

        

    }

}


