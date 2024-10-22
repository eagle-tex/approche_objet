package fr.diginamic.maison;

import fr.diginamic.banque.Utils;

public abstract class Piece {
  private int etage;
  private double superficie;
  private String type;

  public Piece(int etage, double superficie) {
    if (etage < 0) {
      throw new RuntimeException("Etage négatif non accepté à ce stade");
    }
    if (superficie <= 0) {
      throw new RuntimeException("Pièce avec superficie nulle");
    }
    this.etage = etage;
    this.superficie = superficie;
  }

  public abstract String getType();

  public int getEtage() {
    return etage;
  }

  public double getSuperficie() {
    return superficie;
  }

  @Override
  public String toString() {
    return "Pièce: type = "
        + getType()
        + ", étage = "
        + etage
        + ", superficie = "
        + Utils.formatterValeur(superficie)
        + " m²";
  }
}
