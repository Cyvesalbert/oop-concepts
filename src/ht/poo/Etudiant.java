package ht.poo;



import java.util.Comparator;

public class Etudiant {
	final int N = 10;
	private String Matr;
	private String nom;
	private String prenom;	
	private String email; 
	private int section; 
	
        private int n_des_notes;
	private NoteCours [] notes;
	
	
	
	 public Etudiant(String Matr,String nom, int section) {
              //completer
	    }
        
         
	
	public void AjouterNote(String sigle, String titre, int note){ 
		//completer
	}
	
	public double NoteMoyenne(){
		//completer
	}

	public String getMatr() {
		//completer
	}

	public void setMatr(String matr) {
		//completer
	}

        public String getEmail() {
                   //completer
	}

	public void setEmail(String email) {
                      //completer
	}

	public String getNom() {
		//completer
	}
    
	
	public void setNom(String nom) {
		//completer
	}

	public String getPrenom() {
		//completer
	}

	public void setPrenom(String prenom) {
		//completer
	}
	
	public int getSection() {
		return section  ;
	}
	
    public String toString() {
        // completer
    }
    
    public boolean equals(Object etudiant_x) {
            // completer 
    }
    
   

}
