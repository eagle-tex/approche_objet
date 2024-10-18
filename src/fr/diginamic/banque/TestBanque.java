package fr.diginamic.banque;

public class TestBanque {
  public static void main(String[] args) {
    Compte[] tabComptes = new Compte[2];

    tabComptes[0] = new Compte("1234ABCD", "10.00");
    tabComptes[1] = new CompteTaux("1122AABB", "5000", 4.5);

    for (Compte cp : tabComptes) {
      cp.afficherCompte();
    }
  }
}
