package fr.diginamic.combat;

import static fr.diginamic.combat.Utils.obtenirNbAleatoire;

public class Troll extends Creature {

  private static final int FORCE_MIN = 10;
  private static final int FORCE_MAX = 15;
  private static final int SANTE_MIN = 20;
  private static final int SANTE_MAX = 30;

  public Troll() {
    super(obtenirNbAleatoire(FORCE_MIN, FORCE_MAX), obtenirNbAleatoire(SANTE_MIN, SANTE_MAX));
  }

  @Override
  public String getType() {
    return "Troll";
  }

  public static void main(String[] args) {
    Creature gobelin = new Gobelin();
    Creature loup = new Loup();
    Creature troll = new Troll();
    System.out.println(gobelin);
    System.out.println(loup);
    System.out.println(troll);
  }
}
