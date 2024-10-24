package fr.diginamic.combat;

public abstract class PotionAttaque implements Potion {
  protected int bonusAttaque;
  protected int nbCombatsValidite;

  public PotionAttaque(int bonusAttaque) {
    this.bonusAttaque = bonusAttaque;
    //    this.nbCombatsValidite = 1;
  }

  @Override
  public String getType() {
    return "ATTAQUE";
  }

  @Override
  public void utiliser() {
    if (getNbCombatsValidite() == 0) {
      bonusAttaque = 0;
      return;
    }
    nbCombatsValidite--;
  }

  public int getBonusAttaque() {
    if (nbCombatsValidite > 0) return bonusAttaque;
    else return 0;
  }

  public int getNbCombatsValidite() {
    return nbCombatsValidite;
  }

  //  public void setBonusAttaque(int bonusAttaque) {
  //    this.bonusAttaque = bonusAttaque;
  //  }
  //
  //  public void setNbCombatsValidite(int nbCombatsValidite) {
  //    this.nbCombatsValidite = nbCombatsValidite;
  //  }

  @Override
  public String toString() {
    return "Potion "
        + getType()
        + ": bonus en attaque +"
        + getBonusAttaque()
        + " points, valable pendant "
        + getNbCombatsValidite()
        + " combats";
  }
}
