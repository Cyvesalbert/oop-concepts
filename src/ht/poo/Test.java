package ht.poo;

public class Test {

	public static void main(String[] args) {
		Article[] articles = new Article[3];
		
		articles[0] =  new Livre("23400199911", "Initiation à la théorie des probabilités", 33.95 , "pdf");			
		articles[1] =  new CadreDiplome("02045", "Cadre pour diplôme BAC", 139, "Classique");
        //articles[2] =  new Vetement("4549632", "T-shirt Bleu Caraibes Homme Polytechnique", 16.99, 54.0);
        
		CalculePrix(articles);
	}

	public static void CalculePrix(Article[] articles) {
		double prix = 0;
		for(Article article : articles){
			System.out.format("%s, Prix: %.2f, Type: %s%n", article, article.getPrix(1), article.getArticleType());
			prix += article.getPrix(1);
		}
		
		System.out.println("LE PRIX TOTALE = " + prix);	
	}

}
