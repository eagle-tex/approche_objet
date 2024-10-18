package fr.diginamic.instances.entites;

import java.time.LocalDate;

public class Pilote {
  String nom;
  String prenom;
  LocalDate dateLicence;

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public LocalDate getDateLicence() {
    return dateLicence;
  }

  public void setDateLicence(LocalDate dateLicence) {
    this.dateLicence = dateLicence;
  }

  @Override
  public String toString() {
    return "Pilote{"
        + "nom='"
        + nom
        + '\''
        + ", prenom='"
        + prenom
        + '\''
        + ", dateLicence="
        + dateLicence
        + '}';
  }
}
