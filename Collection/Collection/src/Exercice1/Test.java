package Exercice1;

import java.util.Collections;

public class Test {
	public static void main (String Args []) {
		CompareNom NC = new CompareNom();
		CompareMoyenne MC = new CompareMoyenne();
		
		Etudiant Etud = new Etudiant("1", "Ayechi");
		Etudiant Etud1 = new Etudiant("2", "Mokhtar");
		Etudiant Etud2 = new Etudiant("3", "Salim");
		Stats Stats = new Stats();
		Note N1 = new Note("JEE", 12);
		Note N2 = new Note("Java", 18);
		Note N3 = new Note("Math", 15);
		Etud.addNote(N1);
		Etud.addNote(N2);
		Etud.addNote(N3);
		
		Note N4 = new Note("JEE", 18);
		Note N5 = new Note("Java", 13);
		Note N6 = new Note("Math", 11);
		Etud1.addNote(N4);
		Etud1.addNote(N5);
		Etud1.addNote(N6);
		
		Note N7 = new Note("JEE", 19);
		Note N8 = new Note("Java", 5);
		Note N9 = new Note("Math", 15);
		
		Etud2.addNote(N7);
		Etud2.addNote(N8);
		Etud2.addNote(N9);

		Stats.addEtud(Etud1);
		Stats.addEtud(Etud);
		Stats.addEtud(Etud2);
		
		Collections.sort(Stats.getEtudiantsList(), NC);
		
		Stats.getClassDetails();
		System.out.println("Best note: "+Stats.getBestStudent().getNom());
		System.out.println("Worst note: "+Stats.getWorstStudent().getNom());
		
		
	}
}
