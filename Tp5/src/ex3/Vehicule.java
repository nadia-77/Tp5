package ex3;

public class Vehicule {
	private static int comp = 0;
	private final int id;
	protected String modele;
	
	public Vehicule(String modele) {
		this.id = comp++;
		this.modele = modele;
	}

	@Override
	public String toString() {
		return "Vehicule#" + id + " [" + modele + "]";
	}
	
	
	

}
