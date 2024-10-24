package fr.diginamic.combat;

public interface IEtre {
  //  public static int FORCE_INIT_MIN_PERSONNAGE = 12;
  //  public static int FORCE_INIT_MAX_PERSONNAGE = 18;
  //    public static int SANTE_INIT_MIN_PERSONNAGE = 20;
  //    public static int SANTE_INIT_MAX_PERSONNAGE = 50;

  @Override
  public String toString();

  public int getForce();

  public int getSante();

  public String getType();
}
