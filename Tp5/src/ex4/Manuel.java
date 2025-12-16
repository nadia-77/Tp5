package ex4;

public class Manuel extends Livre{
	private String niveau;

	public Manuel(String titre, String auteur, int nbrPage, String niveau) {
		super(titre, auteur, nbrPage);
		this.niveau = niveau;
	}

	public String getNiveau() {
		return niveau;
	}


	@Override
	public String toString() {
		return "Manuel --> [niveau=" + niveau + super.toString()+"]";
	}
	
	

}
