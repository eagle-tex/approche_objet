package fr.diginamic.fichier;

import java.util.Objects;

public class Ville {
  private String nom;
  private String codeDept;
  private String nomRegion;
  private int populationTotale;

  public Ville(String nom, String codeDept, String nomRegion, int populationTotale) {
    this.nom = nom;
    this.codeDept = codeDept;
    this.nomRegion = nomRegion;
    this.populationTotale = populationTotale;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getCodeDept() {
    return codeDept;
  }

  public void setCodeDept(String codeDept) {
    this.codeDept = codeDept;
  }

  public String getNomRegion() {
    return nomRegion;
  }

  public void setNomRegion(String nomRegion) {
    this.nomRegion = nomRegion;
  }

  public int getPopulationTotale() {
    return populationTotale;
  }

  public void setPopulationTotale(int populationTotale) {
    this.populationTotale = populationTotale;
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Ville v)) {
      return false;
    }
    return Objects.equals(v.getCodeDept(), getCodeDept())
        && Objects.equals(v.getNomRegion(), getNomRegion())
        && Objects.equals(v.getNom(), nom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nom, codeDept, nomRegion);
  }

  @Override
  public String toString() {
    return "Ville { "
        + "nom = '"
        + nom
        + "', codeDept = "
        + codeDept
        + ", nomRegion = '"
        + nomRegion
        + "', populationTotale="
        + populationTotale
        + " }";
  }
}
