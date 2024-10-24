package fr.diginamic.combat;

public abstract class Creature {

  private int force;
  private int sante;

  public Creature(int force, int sante) {
    this.force = force;
    this.sante = sante;
  }

  //  @Override
  public int getForce() {
    return force;
  }

  //  @Override
  public int getSante() {
    return sante;
  }

  public void setForce(int force) {
    this.force = force;
  }

  public void setSante(int sante) {
    this.sante = sante;
  }

  public abstract String getType();

  public String toString() {
    return "Créature - "
        + getType()
        + "\n\tForce = "
        + getForce()
        + " points, Santé = "
        + getSante()
        + " points";
  }
}
