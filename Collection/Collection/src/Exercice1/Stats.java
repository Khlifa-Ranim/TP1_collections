package Exercice1;

import java.util.Vector;

public class Stats {
	private Vector <Etudiant> etudiantsList;

	public Stats() {
		etudiantsList = new Vector<Etudiant>(10);
	}
	
	public void addEtud(Etudiant Etud) {
		etudiantsList.addElement(Etud);
	}

	public void getClassDetails() {
		for (int i = 0; i < etudiantsList.size(); i++) {
			System.out.println(etudiantsList.elementAt(i).getNom() + ": Moyenne General = "
					+ etudiantsList.elementAt(i).getAvg() + ", Moyenne Max = "
					+ etudiantsList.elementAt(i).getMax() + ", Moyenne Min = "
					+ etudiantsList.elementAt(i).getMin());
		}
	}
	
	public Vector<Etudiant> getEtudiantsList() {
		return etudiantsList;
	}

	public void setEtudiantsList(Vector<Etudiant> etudiantsList) {
		this.etudiantsList = etudiantsList;
	}

	public double getClassAvg() {
		double ClassAVG = 0;
		for (int i = 0; i < etudiantsList.size(); i++) {
			ClassAVG += etudiantsList.elementAt(i).getAvg();
		}
		ClassAVG = ClassAVG / etudiantsList.size() + 1;
		return ClassAVG ;
	}
	
	public Etudiant getBestStudent(){
		Etudiant bestStudent = etudiantsList.elementAt(0);
		double Max_Moy = bestStudent.getAvg();
		for (int i = 1; i < etudiantsList.size(); i++){
			if(Max_Moy < etudiantsList.elementAt(i).getAvg()){
				bestStudent = etudiantsList.elementAt(i);
				Max_Moy = bestStudent.getAvg();
			}
		}
		return bestStudent;
	}
	
	public Etudiant getWorstStudent(){
		Etudiant worstStudent = etudiantsList.elementAt(0);
		double Min_Moy = worstStudent.getAvg();
		for (int i = 1; i < etudiantsList.size(); i++){
			if(Min_Moy > etudiantsList.elementAt(i).getAvg()){
				worstStudent = etudiantsList.elementAt(i);
				Min_Moy = worstStudent.getAvg();
			}
		}
		return worstStudent;
	}

}
