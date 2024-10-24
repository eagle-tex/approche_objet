package fr.diginamic.combat;

import static fr.diginamic.combat.Utils.obtenirNbAleatoire;

public class Gobelin extends Creature {

  private static final int FORCE_MIN = 5;
  private static final int FORCE_MAX = 10;
  private static final int SANTE_MIN = 10;
  private static final int SANTE_MAX = 15;

  public Gobelin() {
    super(obtenirNbAleatoire(FORCE_MIN, FORCE_MAX), obtenirNbAleatoire(SANTE_MIN, SANTE_MAX));
  }

  @Override
  public String getType() {
    return "Gobelin";
  }
}
