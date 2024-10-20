package fr.diginamic.banque;

public class CompteTaux extends Compte {

  private double taux;

  public CompteTaux(String numero, String solde, double taux) {
    super(numero, solde);
    this.taux = taux;
  }

  public CompteTaux(String numero, double taux) {
    super(numero);
    this.taux = taux;
  }

  public double getTaux() {
    return taux;
  }

  public void setTaux(double taux) {
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
