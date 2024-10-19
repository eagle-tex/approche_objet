package fr.diginamic.banque;

public class Debit extends Operation {

  private static final String TYPE = "DEBIT";

  public Debit(String date, String strMontant) {
    super(date, strMontant);
  }

  @Override
  public String getType() {
    //    return "DEBIT";
    return Debit.TYPE;
  }

  @Override
  public String toString() {
    String operation = super.toString();
    return operation + ", { type=" + getType() + " }";
  }
}
