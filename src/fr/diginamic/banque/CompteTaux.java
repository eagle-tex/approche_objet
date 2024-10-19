package fr.diginamic.banque;

public class CompteTaux extends Compte {

  //  private static final DecimalFormat df = new DecimalFormat("0.00");

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
    return infosCompte + " { taux=" + Utils.DECIMAL_FORMAT.format(taux) + "% }";
  }

  public static void main(String[] args) {
    CompteTaux compteTaux1 = new CompteTaux("1122AABB", "5000", 4.5);
    CompteTaux compteTaux2 = new CompteTaux("1122AABB", 2.00);

    compteTaux1.afficherCompte();
    compteTaux2.afficherCompte();
  }
}
