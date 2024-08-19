package ht.poo;


public class Livre extends Article {
	private String format;   // pdf, epub  ou paper
	
	public Livre(String NumProduit, String nom, String format){
		//completer
		super(NumProduit, nom);
		this.format = format;
	}
	
	public Livre(String NumProduit, String nom, double prix, String format){
	      //completer
		super(NumProduit, nom, prix);
		this.format = format;
	}
	
	
	public String getArticleType() {
	        //completer
		return "Livre";
	}

	public String getFormat() {
		//completer
		return format;
	}

	public void setFormat(String format) {
	         //completer
		this.format = format;
	}
	
}

