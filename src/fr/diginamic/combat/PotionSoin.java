package fr.diginamic.combat;

public class PotionSoin implements Potion {
  private int valeurSante;
  private static final int BAS = 5;
  private static final int HAUT = 10;

  public PotionSoin() {
    this.valeurSante = Utils.obtenirNbAleatoire(BAS, HAUT);
  }

  @Override
  public String getType() {
    return "SOIN";
  }

  @Override
  public void utiliser() {
    valeurSante = 0;
  }

  public int getValeurSante() {
    return valeurSante;
  }

  @Override
  public String toString() {
    return "Potion " + getType() + ": +" + getValeurSante() + " points de santé";
  }

  // Test de la classe PotionSoin
  public static void main(String[] args) {
    final int NB = 10;
    Potion[] tabPotionsSoin = new PotionSoin[NB];

    for (int i = 0; i < NB; i++) {
      tabPotionsSoin[i] = new PotionSoin();
      System.out.println(tabPotionsSoin[i]);
    }
  }
}
