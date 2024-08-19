package ht.poo;


public class CadreDiplome extends Article {
	private String categorie;
	private String couleur;
	
	public CadreDiplome(String NumProduit, String nom, double prix, String couleur,String categorie){
		//completer
		super(NumProduit, nom, prix);
		this.couleur = couleur;
		this.categorie = categorie;
		
	}
	
	public CadreDiplome(String NumProduit, String nom, double prix,String categorie){
		//completer
		super(NumProduit, nom, prix);
		this.categorie = categorie;
		
	}
	
	@Override
	public String getArticleType() {
		//completer
		return "Cadre Diplome";
	}

	public double getCategorie() {
		//completer
		return 0.0;
	}

	public void setCategorie(String categorie) {
                   //completer
		this.categorie = categorie;
	}
	
}
