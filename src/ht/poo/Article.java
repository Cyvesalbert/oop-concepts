package ht.poo;

public class Article {	
	private final String NumProduit; 
	private String nom;
	private double Prix_net;


    public Article(String NumProduit, String nom){
                    //completer
    	this.NumProduit = NumProduit;
    	this.nom = nom;
	}
	
	public Article(String np, String nom, double prix){		
		//completer
		this.NumProduit = np;
		this.nom = nom;
		this.Prix_net = prix;
	}
	

	public String getNumProduit() {
		//completer
		return NumProduit;
	}	
	
	public String getNom() {
		//completer
		return nom;
	}
	
	public void setNom(String nom) {
		//completer
		this.nom = nom;
	}
	
	public double getPrixNet() {
		//completer
		return Prix_net;
	}
		
	public void setPrixNet(double prix_net) {
		//completer
		this.Prix_net = prix_net;
	}
	
	public double getVAT(){
		//completer
		return 0.0;
	}
	
	public double getPrix(int count){
		//completer
		return Prix_net * count;
	}
	
	public String getArticleType(){
		//completer
		return "Article";
	}
	
	public String toString() {
		//completer
		return "NumProduit: " + this.NumProduit + ", Nom: " + this.nom + ", Prix: " + this.Prix_net;
	}
}
