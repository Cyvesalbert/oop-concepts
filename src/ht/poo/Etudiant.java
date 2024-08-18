package ht.poo;


import java.util.Arrays;
import java.util.Comparator;

public class Etudiant {
	
	final int N = 10;
	private String Matr;
	private String nom;
	private String prenom;	
	private String programme;
	private String email; 
	private int section; 
    private int n_des_notes = 5;
	private NoteCours[] notes;
	int currentSize = 0;
	
	
	 public Etudiant(String Matr,String nom, String programme, int section) {
              //completer
		 	this.Matr = Matr;
		 	this.nom = nom;
		 	this.programme = programme;
		 	this.section = section;
		 	this.notes = new NoteCours[n_des_notes];
	}
        
	 public int getN_des_notes() {
		 return n_des_notes;
	 }
         
	
	public void AjouterNote(String sigle, String titre, int note){ 
		//completer
		NoteCours noteCours = new NoteCours(sigle, titre, note);
        notes[currentSize] = noteCours; // Add the new NoteCours object to the array
        currentSize++;
        
	}
	
	public double NoteMoyenne(){
		//completer
		int sum = 0;
	    int count = 0;

	    for (NoteCours n : notes) {
	       if (n != null) { // Check if the note is not null
	            sum += n.getNote(); // Use getter if note is private
	            count++;
	        }
	    }

	    if (count == 0) {
	        // Handle the case where all notes are null or count is zero
	        return 0.0;
	    }

	    return (double) sum / count;
	}

	public String getMatr() {
		//completer
		return Matr;
	}

	public void setMatr(String matr) {
		//completer
		this.Matr = matr;
	}

    public String getEmail() {
        //completer
    	return email;
	}

	public void setEmail(String email) {
                      //completer
	}

	public String getNom() {
		//completer
		return nom;
	}
    
	
	public void setNom(String nom) {
		//completer
		this.nom = nom;
	}

	public String getPrenom() {
		//completer
		return prenom;
	}

	public void setPrenom(String prenom) {
		//completer
		this.prenom = prenom;
	}
	
	public int getSection() {
		return section;
	}
	
    public String toString() {
        // completer
    	return this.Matr + this.nom + this.prenom + this.email + this.programme + this.email + this.section;
    }
    
    public boolean equals(Object etudiant_x) {
            // completer 
    	if(etudiant_x.equals(this))
    		return true;
    	
    	return false;
    }
    
   

}
