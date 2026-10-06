package com.exercice2.tp;

public class Etudiant {
	public Etudiant( String nom, String prenom) {
		this.id = ++comp;
		this.nom = nom;
		this.prenom = prenom;
	}
	private static int comp = 0;
    private final int id;
    private String nom;
    private String prenom;
    private Filiere filiere;
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		String fil=(filiere!= null ? filiere.getNom() : "Aucune");
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", filiere=" + fil + "]";
	}  
}
