package ma.projet.bean;

public class Categorie {
	public Categorie(String libelle, String code) {
		this.id =++compteur;
		this.code = code;
		this.libelle = libelle;
	}
	private static int compteur=0;
	private int id;
	private String code;
	private String libelle;
	public int getId() {
		return id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}
}
