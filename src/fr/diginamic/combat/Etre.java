package fr.diginamic.combat;

public abstract class Etre {
  private int force;
  private int sante;
  private int score;

  public Etre(int force, int sante, int score) {
    this.force = force;
    this.sante = sante;
    this.score = score;
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

  public abstract String getType();
}
