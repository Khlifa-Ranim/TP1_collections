package Exercice1;

import java.util.Comparator;

public class CompareNom implements Comparator<Etudiant> {


	public int compare(Etudiant E1, Etudiant E2) {
		return E1.getNom().compareTo(E2.getNom());
	}
	
}
