package fr.diginamic.maison;

public class SalleDeBain extends Piece {

  public SalleDeBain(int etage, double superficie) {
    super(etage, superficie);
  }

  public String getType() {
    return "Salle de bain";
  }
}
