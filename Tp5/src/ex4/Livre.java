package ex4;

public class Livre extends Document{
	private String auteur;
	private int nbrPage;
	
	
	public Livre(String titre, String auteur, int nbrPage) {
		super(titre);
		this.auteur = auteur;
		this.nbrPage = nbrPage;
	}


	public String getAuteur() {
		return auteur;
	}



	@Override
	public String toString() {
		return "Livre --> [num d'Enregistrement : "+ getNumEnreg()+" Titre= "+getTitre()+ ", auteur=" + auteur + ", nbrPage=" + nbrPage + "]";
	}

	



}
