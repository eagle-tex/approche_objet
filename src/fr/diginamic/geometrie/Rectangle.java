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

  @Override
  public String toString() {
    return "Rectangle { longueur = "
        + Utils.formatterValeur(longueur)
        + ", largeur = "
        + Utils.formatterValeur(largeur)
        + " }";
  }
}
