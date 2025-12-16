package ex4;

public class Roman extends Livre{
	private double prix;

	

	public Roman(String titre, String auteur, int nbrPage, double prix) {
		super(titre, auteur, nbrPage);
		this.prix = prix;
	}

	public double getPrix() {
		return prix;
	}


	@Override
	public String toString() {
		return "Roman --> [ " +super.toString()+", prix=" + prix+"]";
	}

	
	

}
