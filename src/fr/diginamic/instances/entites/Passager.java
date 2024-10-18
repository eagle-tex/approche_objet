package fr.diginamic.instances.entites;

public class Passager {
  String nom;
  String prenom;
  String numeroSiege;

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

  public String getNumeroSiege() {
    return numeroSiege;
  }

  public void setNumeroSiege(String numeroSiege) {
    this.numeroSiege = numeroSiege;
  }

  @Override
  public String toString() {
    return "Passager{"
        + "nom='"
        + nom
        + '\''
        + ", prenom='"
        + prenom
        + '\''
        + ", numeroSiege='"
        + numeroSiege
        + '\''
        + '}';
  }
}
