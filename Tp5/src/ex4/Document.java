package ex4;


public class Document {
	private static int comp = 0;
	private final int numEnreg;
	private String titre;

	public Document(String titre) {
		this.numEnreg = ++comp;
		this.titre = titre;
	}
	
	
	public String getTitre() {
		return titre;
	}


	public int getNumEnreg() {
		return numEnreg;
	}


	@Override
	public String toString() {
		return "Document [numEnreg=" + numEnreg + ", titre=" + titre + "]";
	}
	
	
	

}
