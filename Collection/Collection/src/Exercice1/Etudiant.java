package Exercice1;

import java.util.ArrayList;

import java.util.Iterator;

public class Etudiant implements IStatisticable, Comparable<Etudiant>{
	private String emat;
	private String nom;
	private ArrayList<Note> Notes;

	public Etudiant(String emat, String nom) {
		this.emat = emat;
		this.nom = nom;
		Notes = new ArrayList<>(10);
	}

	public String getEmat() {
		return emat;
	}

	public void setEmat(String emat) {
		this.emat = emat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Note> getNotes() {
		return Notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		Notes = notes;
	}
	
	public void addNote(Note new_note) {
		Notes.add(new_note);
	}

	@Override
	public double getAvg() {
		double sum = 0;
		for (int i = 0; i < Notes.size(); i++ ){
			sum +=  Notes.get(i).getNotes();
		}
		double AVG = sum / Notes.size() +1 ;
		return AVG;
	}
	

	@Override
	public double getMin() {
		double Min = Notes.get(0).getNotes();
		for (Note n: Notes){
			if(Min > n.getNotes())
				Min = n.getNotes();
		}
		return Min;
	}

	@Override
	public double getMax() {
		Iterator<Note> Iter = Notes.iterator();
		double Max = Notes.get(0).getNotes();
		while (Iter.hasNext()) {
			Note it =Iter.next();
			if (Max < it.getNotes()){
				Max = it.getNotes();
			}
		}
		return Max;
	}

	@Override
	public int compareTo(Etudiant Etud) {
		return getEmat().compareTo(Etud.getEmat());
	}
	
	

}
