package ex4;

public class Dictionnaire extends Document{
	private String langue;

	

	public Dictionnaire(String titre, String langue) {
		super(titre);
		this.langue = langue;
	}


	@Override
	public String toString() {
		return "Dictionnaire --> [Num d'enregistrement = "+getNumEnreg()+", Titre = "+getTitre() + ", Langue=" + langue + "]";
	}
	
	

}
