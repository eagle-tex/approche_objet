package fr.diginamic.combat;

public class PotionAttaqueMajeure extends PotionAttaque {

  private static final int ATTAQUE_MAJEURE = 5;

  public PotionAttaqueMajeure() {
    super(ATTAQUE_MAJEURE);
    this.nbCombatsValidite = 2;
  }

  @Override
  public String getType() {
    return "ATTAQUE MAJEURE";
  }

  // Test de la classe PotionAttaqueMajeure
  public static void main(String[] args) {
    final int NB = 2;
    Potion[] tabPotionsAttaqueMajeure = new PotionAttaqueMajeure[NB];

    for (int i = 0; i < NB; i++) {
      tabPotionsAttaqueMajeure[i] = new PotionAttaqueMajeure();
      System.out.println(tabPotionsAttaqueMajeure[i]);
    }
  }
}
