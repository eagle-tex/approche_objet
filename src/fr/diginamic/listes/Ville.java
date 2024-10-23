package fr.diginamic.listes;

import java.util.Objects;

public class Ville {
  private String nom;
  private int nbHabitants;

  public Ville(String nom, int nbHabitants) {
    this.nom = nom;
    this.nbHabitants = nbHabitants;
  }

  public String getNom() {
    return nom;
  }

  public int getNbHabitants() {
    return nbHabitants;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setNbHabitants(int nbHabitants) {
    this.nbHabitants = nbHabitants;
  }

  @Override
  public String toString() {
    return "Ville { " + "nom = '" + nom + "', nbHabitants = " + nbHabitants + " }";
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Ville v)) {
      return false;
    }
    return Objects.equals(v.getNom(), nom) && v.getNbHabitants() == this.nbHabitants;
  }

  @Override
  public int hashCode() {
    return Objects.hash(nom, nbHabitants);
  }
}
