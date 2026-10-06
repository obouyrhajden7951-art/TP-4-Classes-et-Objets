package com.exercice1.tp;

public class Main {
	public static void main(String[] args) {
		Etudiant e1=new Etudiant("Oumaima","Rami");
		Etudiant e2=new Etudiant("Samira","Alami");
		e1.ajouterNote(16.5);
		e1.ajouterNote(14.75);
		e1.ajouterNote(15.25);
		e2.ajouterNote(12.0);
		e2.ajouterNote(14.25);
		e1.afficherNotes();
		System.out.println(e1);
		e2.afficherNotes();
		System.out.println(e2);
	}
}
