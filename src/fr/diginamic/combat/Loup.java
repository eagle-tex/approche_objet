package fr.diginamic.combat;

import static fr.diginamic.combat.Utils.obtenirNbAleatoire;

public class Loup extends Creature {

  //  private int force;
  //  private int sante;

  private static final int FORCE_MIN = 3;
  private static final int FORCE_MAX = 8;
  private static final int SANTE_MIN = 5;
  private static final int SANTE_MAX = 10;

  public Loup() {
    super(obtenirNbAleatoire(FORCE_MIN, FORCE_MAX), obtenirNbAleatoire(SANTE_MIN, SANTE_MAX));
  }

  //  @Override
  //  public int getForce() {
  //    return force;
  //  }
  //
  //  @Override
  //  public int getSante() {
  //    return sante;
  //  }

  @Override
  public String getType() {
    return "Loup";
  }
}
