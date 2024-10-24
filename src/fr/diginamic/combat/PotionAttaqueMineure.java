package fr.diginamic.combat;

public class PotionAttaqueMineure extends PotionAttaque {

  private static final int ATTAQUE_MINEURE = 3;

  public PotionAttaqueMineure() {
    super(ATTAQUE_MINEURE);
    this.nbCombatsValidite = 1;
  }

  @Override
  public String getType() {
    return "ATTAQUE MINEURE";
  }

  public String toString() {
    return "Potion "
        + getType()
        + ": bonus en attaque +"
        + getBonusAttaque()
        + " points, valable pendant "
        + getNbCombatsValidite()
        + " combat";
  }

  // Test de la classe PotionAttaqueMineure
  public static void main(String[] args) {
    final int NB = 4;
    Potion[] tabPotionsAttaqueMineure = new PotionAttaqueMineure[NB];

    for (int i = 0; i < NB; i++) {
      tabPotionsAttaqueMineure[i] = new PotionAttaqueMineure();
      System.out.println(tabPotionsAttaqueMineure[i]);
    }
  }
}
