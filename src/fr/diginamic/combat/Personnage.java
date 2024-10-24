package fr.diginamic.combat;

import static fr.diginamic.combat.Constants.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Personnage implements IEtre {
  private int force;
  private int sante;
  private int score;
  private List<Potion> potions;

  public Personnage() {
    this.force = Utils.obtenirNbAleatoire(FORCE_INIT_MIN_PERSONNAGE, FORCE_INIT_MAX_PERSONNAGE);
    this.sante = Utils.obtenirNbAleatoire(SANTE_INIT_MIN_PERSONNAGE, SANTE_INIT_MAX_PERSONNAGE);
    this.score = 0;
    this.potions = new ArrayList<>();
    // créer 3 potions
    Potion potionSoin = new PotionSoin();
    Potion potionAttaqueMineure = new PotionAttaqueMineure();
    Potion potionAttaqueMajeure = new PotionAttaqueMajeure();
    // Ajouter 3 potions
    this.potions.addAll(Arrays.asList(potionSoin, potionAttaqueMineure, potionAttaqueMajeure));
  }

  public String getType() {
    return "Personnage";
  }

  public int getForce() {
    return force;
  }

  public int getSante() {
    return sante;
  }

  public int getScore() {
    return score;
  }

  public List<Potion> getPotions() {
    return new ArrayList<>(potions);
  }

  public StringBuilder listerLesPotions() {
    StringBuilder message = new StringBuilder();
    for (int i = 0; i < potions.size(); i++) {
      message
          .append("\t\t")
          .append((i + 1))
          .append(". ")
          .append((potions.get(i)).toString())
          .append("\n");
    }
    return message;
  }

  public String toString() {
    return "Personnage"
        + "\n\tForce = "
        + getForce()
        + " points, Santé = "
        + getSante()
        + " points, Score = "
        + getScore()
        + " points"
        + "\n\tPotions: nombre = "
        + getPotions().size()
        + "\n"
        + listerLesPotions();
  }

  public static void main(String[] args) {
    Personnage bilbo = new Personnage();
    System.out.println(bilbo);
  }
}
