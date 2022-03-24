package Exercice1;

import java.util.Comparator;

public class CompareMoyenne implements Comparator<Etudiant> {

	public int  compare(Etudiant E1, Etudiant E2) {
		int n = 0;
		if(E1.getAvg() > E2.getAvg()){
			n = 1;
		} else if (E1.getAvg() < E2.getAvg()){
			n = -1;
		} else {
			n = 0;
		}
		return n;
	}

}
