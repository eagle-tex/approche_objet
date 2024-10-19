package fr.diginamic.geometrie;

import fr.diginamic.banque.Utils;

public class Carre extends Rectangle {

  private final double cote;

  public Carre(double cote) {
    super(cote, cote);
    this.cote = cote;
  }

  @Override
  public String toString() {
    return "Carré { côté = " + Utils.formatterValeur(this.cote) + " }";
  }
}
