package fr.diginamic.maison;

public class Salon extends Piece {

  public Salon(int etage, double superficie) {
    super(etage, superficie);
  }

  public String getType() {
    return "Salon";
  }
}
