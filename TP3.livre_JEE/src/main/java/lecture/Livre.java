package lecture;

import java.io.Serializable;
public class Livre implements Serializable{
private Long idLivre;
private String titreLivre;
private String auteur;
private double prix;
private String genre;
private int nbpages;

public Livre() {
super();
}
public Livre(String titreLivre, String auteur,double prix, String genre,int nbpages) {
super();
this.setTitreLivre(titreLivre);
this.setAuteur(auteur);

this.prix = prix;
this.setGenre(genre);
this.setNbpages(nbpages);
}

public double getPrix() {
return prix;
}
public void setPrix(double prix) {
this.prix = prix;
}
public Long getIdLivre() {
	return idLivre;
}
public void setIdLivre(Long idLivre) {
	this.idLivre = idLivre;
}
public String getTitreLivre() {
	return titreLivre;
}
public void setTitreLivre(String titreLivre) {
	this.titreLivre = titreLivre;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getNbpages() {
	return nbpages;
}
public void setNbpages(int nbpages) {
	this.nbpages = nbpages;
}}
