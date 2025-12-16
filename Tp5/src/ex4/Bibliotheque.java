package ex4;

public class Bibliotheque {
	private int capacité;
    private Document[] documents;
    private int nbDocs; 
    
	public Bibliotheque(int capacité) {
		this.capacité = capacité;
		this.documents = new Document[capacité];
		this.nbDocs = 0;
	}
	
	public int getCapacité() {
		return capacité;
	}
	public void setCapacité(int capacité) {
		this.capacité = capacité;
	}
	
	public void afficherDocuments() {
		if (nbDocs == 0)
		{
			System.out.println("Pas de document dans la bibliothèque ");
		}
		else {
		System.out.println("Voici la liste des documents : ");
		for(int i=0; i<nbDocs; i++) {
			 System.out.println(documents[i]);
			
		 }
		}
	}
   
	public boolean ajouter(Document doc) {
		if (nbDocs >= capacité) {
            System.out.println("La bibliothèque est pleine !");
            return false;
        }
		
        documents[nbDocs] = doc;
        nbDocs++;
        return true;
		
	}
	
	boolean supprimer(Document doc) {
	    int pos = -1;
	    for (int i = 0; i < nbDocs; i++) {
	        if (documents[i] == doc) { 
	            pos = i;
	            break;
	        }
	    }
	    if (pos == -1) {
	    	System.out.println("Le document n'existe pas ");
	        return false;
	    }

	    for (int i = pos; i < nbDocs - 1; i++) {
	        documents[i] = documents[i + 1];
	    }
	    documents[nbDocs - 1] = null;
	    nbDocs--;
	    System.out.println("Le document est supprimé ");
	    return true;
	}
	
	public Document document(int numEnreg) {
	    for (int i = 0; i < nbDocs; i++) {
	        if (documents[i].getNumEnreg() == numEnreg) {
	            return documents[i];
	            
	        }
	    }
	    return null;
	}
	
	    public void afficherAuteurs() {
	        for (int i = 0; i < nbDocs; i++) {

	            if (documents[i] instanceof Livre) {
	                Livre l = (Livre) documents[i];
	                System.out.println(l.getAuteur());
	            }
	        }
	    }

}
