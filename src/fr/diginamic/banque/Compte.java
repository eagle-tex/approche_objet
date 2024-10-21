package fr.diginamic.banque;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Compte {
  private String numero;
  private BigDecimal solde;

  public Compte(String numero, String strSolde) {
    this.numero = numero;
    this.solde = strToBigDecimal(strSolde);
  }

  public Compte(String numero) {
    this.numero = numero;
    this.solde = strToBigDecimal("0.00");
  }

  public BigDecimal strToBigDecimal(String solde) {
    //    return new BigDecimal(solde).setScale(2, RoundingMode.UP);
    return formatBigDecimal(new BigDecimal(solde));
  }

  public BigDecimal formatBigDecimal(BigDecimal montant) {
    return montant.setScale(2, RoundingMode.UP);
  }

  public void afficherCompte() {
    System.out.println(this);
  }

  public String getNumero() {
    return numero;
  }

  //  public void setNumero(String numCompte) {
  //    this.numCompte = numCompte;
  //  }

  public BigDecimal getSolde() {
    //    return solde.setScale(2, RoundingMode.UP);
    return formatBigDecimal(solde);
  }

  //  public void setSolde(String solde) {
  //    this.solde = strToBigDecimal(solde);
  //  }

  @Override
  public String toString() {
    BigDecimal solde2Dec = this.getSolde();
    return "Compte: { numCompte=" + numero + ", solde=€" + solde2Dec + " }";
  }

  public static void main(String[] args) {
    Compte compte1 = new Compte("1234ABCD", "10.00");
    Compte compte2 = new Compte("4321DCBA", "10");
    Compte compte3 = new Compte("1357EGHI", "10.5678");

    compte1.afficherCompte();
    compte2.afficherCompte();
    compte3.afficherCompte();
  }
}
