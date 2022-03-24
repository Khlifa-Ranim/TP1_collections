package Exercice1;

public class Note {
	private String NomCours;
	private double notes;
	public Note(String nomCours, double notes) {
		super();
		NomCours = nomCours;
		this.notes = notes;
	}
	public String getNomCours() {
		return NomCours;
	}
	public void setNomCours(String nomCours) {
		NomCours = nomCours;
	}
	public double getNotes() {
		return notes;
	}
	public void setNotes(double notes) {
		this.notes = notes;
	}
	
}
