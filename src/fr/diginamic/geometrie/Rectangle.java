package fr.diginamic.geometrie;

import fr.diginamic.banque.Utils;

public class Rectangle implements ObjetGeometrique {
  private final double longueur;
  private final double largeur;

  public Rectangle(double longueur, double largeur) {
    if (Utils.validerValeurPositive(longueur) && Utils.validerValeurPositive(largeur)) {
      this.longueur = longueur;
      this.largeur = largeur;
    } else {
      throw new IllegalArgumentException("Dimensions invalides");
    }
  }

  @Override
  public double perimetre() {
    return 2 * (longueur + largeur);
  }

  @Override
  public double surface() {
    return longueur * largeur;
  }

  public double getLargeur() {
    return largeur;
  }

  public double getLongueur() {
    return longueur;
  }

  @Override
  public String toString() {
    return "Rectangle { longueur = "
        + Utils.formatterValeur(getLongueur())
        + ", largeur = "
        + Utils.formatterValeur(getLargeur())
        + " }";
  }
}
