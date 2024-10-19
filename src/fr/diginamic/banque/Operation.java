package fr.diginamic.banque;

import java.math.BigDecimal;

public abstract class Operation {
  //  private static final DecimalFormat df = new DecimalFormat("0,00");

  private String date;
  private BigDecimal montant;

  public Operation(String date, String strMontant) {
    this.date = date;
    this.montant = Utils.strToBigDecimal(strMontant);
  }

  public abstract String getType();

  public String getDate() {
    return date;
  }

  public BigDecimal getMontant() {
    return montant;
  }

  @Override
  public String toString() {
    return "Operation { date='" + date + '\'' + ", montant=" + Utils.deviseFrance(montant) + " }";
  }
}
