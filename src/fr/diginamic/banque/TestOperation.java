package fr.diginamic.banque;

import java.math.BigDecimal;

public class TestOperation {

  public static void main(String[] args) {

    Credit credit1 = new Credit("20240205", "3200");
    Credit credit2 = new Credit("20240210", "4300");
    Debit debit1 = new Debit("20240214", "1600");
    Debit debit2 = new Debit("20240219", "900");

    Operation[] tabOperations = new Operation[] {credit1, credit2, debit1, debit2};

    for (Operation op : tabOperations) {
      System.out.println(op);
    }

    BigDecimal montantTotal = calculerMontantTotal(tabOperations);
    System.out.println("\nMontant total des opérations: " + Utils.deviseFrance(montantTotal));
  }

  public static BigDecimal calculerMontantTotal(Operation... ops) {
    BigDecimal montantTotal = new BigDecimal("0.0");

    for (Operation op : ops) {
      if (op.getType().equals("CREDIT")) {
        montantTotal = montantTotal.add(op.getMontant());
      } else {
        montantTotal = montantTotal.subtract(op.getMontant());
      }
    }

    return montantTotal;
  }
}
