package fr.diginamic.sets;

import java.util.Objects;

import static fr.diginamic.banque.Utils.frenchFormatter;

public class Pays {
  private String nom;
  private long nbHabitants;
  private int pibParHabitant;

  public Pays(String nom, int nbHabitants, int pibParHabitant) {
    this.nom = nom;
    this.nbHabitants = nbHabitants;
    this.pibParHabitant = pibParHabitant;
  }

  public long getPibTotal() {
    return nbHabitants * pibParHabitant;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public long getNbHabitants() {
    return nbHabitants;
  }

  public void setNbHabitants(long nbHabitants) {
    this.nbHabitants = nbHabitants;
  }

  public int getPibParHabitant() {
    return pibParHabitant;
  }

  public void setPibParHabitant(int pibParHabitant) {
    this.pibParHabitant = pibParHabitant;
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Pays p)) {
      return false;
    }
    return Objects.equals(p.getNom().toLowerCase(), nom.toLowerCase());
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(nom.toLowerCase());
  }

  @Override
  public String toString() {
    return "Pays -> "
        + String.format("%-10s", nom)
        + String.format("%15s", frenchFormatter.format(nbHabitants))
        + " habitants\t\t"
        + "PIB/habitant = "
        + String.format("%6s", frenchFormatter.format(pibParHabitant));
  }
}
