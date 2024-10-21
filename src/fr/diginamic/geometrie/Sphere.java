package fr.diginamic.geometrie;

import fr.diginamic.banque.Utils;

public class Sphere implements Objet3D {

  private final double rayon;

  public Sphere(double rayon) {
    if (Utils.validerValeurPositive(rayon)) {
      this.rayon = rayon;
    } else {
      throw new IllegalArgumentException("Le rayon de la sphère est invalide");
    }
  }

  @Override
  public double volume() {
    return 4.0 / 3.0 * Math.pow(rayon, 3) * Math.PI;
  }

  @Override
  public double perimetre() {
    return new Cercle(rayon).perimetre();
  }

  @Override
  public double surface() {
    return 4.0 * Math.pow(rayon, 2) * Math.PI;
  }

  public double getRayon() {
    return rayon;
  }

  @Override
  public String toString() {
    return "Sphere { rayon = " + Utils.formatterValeur(getRayon()) + " }";
  }
}
