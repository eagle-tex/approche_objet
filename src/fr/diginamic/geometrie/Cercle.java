package fr.diginamic.geometrie;

import fr.diginamic.banque.Utils;

public class Cercle implements ObjetGeometrique {

  private final double rayon;

  public Cercle(double rayon) {
    if (Utils.validerValeurPositive(rayon)) {
      this.rayon = rayon;
    } else {
      throw new IllegalArgumentException("Le rayon du cercle est invalide");
    }
  }

  @Override
  public double perimetre() {
    return (2 * rayon * Math.PI);
  }

  @Override
  public double surface() {
    return Math.pow(rayon, 2) * Math.PI;
  }

  public double getRayon() {
    return rayon;
  }

  @Override
  public String toString() {
    return "Cercle { rayon = " + Utils.formatterValeur(rayon) + " }";
  }
}
