package ex4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println("Entrer le nombre de Documents de la bibliotheque: ");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		Bibliotheque b1 = new Bibliotheque(n);
		b1.ajouter(new Roman("Brida", "paulo coelho", 300, 90.00));
		b1.ajouter(new Dictionnaire("Larouse", "Francais"));
		int choix;
		do {
			System.out.println("**** MENU *****");
			System.out.println("Choisir le type de l’opération que vous voulez :");
			System.out.println("1 => Ajouter");
			System.out.println("2 => Afficher les documents");
			System.out.println("3 => Afficher les auteur");
			System.out.println("4 => Supprimer");
			System.out.println("5 => Chercher un document par numero");
			System.out.println("6 => Quiter ");
			System.out.println("Votre choix :");
			choix = sc.nextInt();
			switch (choix) {
			case 1:
				System.out.println("Choisir un type :");
				System.out.println("1 => Roman");
				System.out.println("2 => Manuel");
				System.out.println("3 => Revue");
				System.out.println("4 => Dictionnaire");
				int type = sc.nextInt();
				sc.nextLine();

				Document doc = null;
				switch (type) {
				case 1:
					System.out.println("Entrez les donnes du roman :");
					System.out.print("Titre : ");
					String titre = sc.nextLine();
					System.out.print("Auteur : ");
					String auteur = sc.nextLine();
					System.out.print("Nombre de pages : ");
					int nbPages = sc.nextInt();
					System.out.print("Prix : ");
					double prix = sc.nextDouble();
					sc.nextLine();
					doc = new Roman(titre, auteur, nbPages, prix);
					break;

				case 2:
					System.out.println("Entrez les donnes du Manuel :");
					System.out.print("Titre :");
					titre = sc.nextLine();
					System.out.print("Auteur : ");
					auteur = sc.nextLine();
					System.out.print("Nombre de pages : ");
					nbPages = sc.nextInt();
					sc.nextLine();
					System.out.print("Niveau : ");
					String niveau = sc.nextLine();

					doc = new Manuel(titre, auteur, nbPages, niveau);
					break;

				case 3:
					System.out.println("Entrez les donnes du revue :");
					System.out.print("Titre : ");
					titre = sc.nextLine();
					System.out.print("Mois : ");
					String mois = sc.nextLine();
					System.out.print("Année : ");
					int annee = sc.nextInt();
					doc = new Revue(titre, mois, annee);
					break;

				case 4:
					System.out.println("Entrez les donnes du dictionnaire :");
					System.out.print("Titre : ");
					titre = sc.nextLine();
					System.out.print("Langue : ");
					String langue = sc.nextLine();
					doc = new Dictionnaire(titre, langue);
					break;
				}

				if (doc != null && b1.ajouter(doc)) {
					System.out.println("Document ajouté avec succès.");
				} else {
					System.out.println("Échec de l'ajout.");
				}
				break;

			case 2:
				b1.afficherDocuments();
				break;

			case 3:
				b1.afficherAuteurs();
				break;

			case 4:
				System.out.print("Numero d’enregistrement : ");
				int numSup = sc.nextInt();
				Document dSup = b1.document(numSup);

				if (dSup != null && b1.supprimer(dSup)) {
					System.out.println("Document supprimé.");
				} else {
					System.out.println("Document introuvable.");
				}
				break;

			case 5:
				System.out.print("Numero d’enregistrement : ");
				int num = sc.nextInt();
				Document res = b1.document(num);

				if (res != null) {
					System.out.println(res);
				} else {
					System.out.println("Document introuvable.");
				}
				break;

			case 6:
				System.out.println("Fin programme");
				break;

			default:
				System.out.println("Choix invalide");
			}

		} while (choix != 6);

		sc.close();

	}

}
