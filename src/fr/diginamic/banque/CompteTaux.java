package fr.diginamic.banque;

public class CompteTaux extends Compte {
  private double taux;

  public CompteTaux(String numCompte, String solde, double taux) {
    super(numCompte, solde);
    this.taux = taux;
  }

  public CompteTaux(String numCompte, double taux) {
    super(numCompte);
    this.taux = taux;
  }

  @Override
  public String toString() {
    String infosCompte = super.toString();
    return infosCompte + " { taux=" + taux + " }";
  }

  public static void main(String[] args) {
    CompteTaux compteTaux1 = new CompteTaux("1122AABB", "5000", 4.5);

    compteTaux1.afficherCompte();
  }
}
