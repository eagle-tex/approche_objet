package fr.diginamic.banque;

public class Credit extends Operation {
  private static final String TYPE = "CREDIT";

  public Credit(String date, String strMontant) {
    super(date, strMontant);
  }

  @Override
  public String getType() {
    //    return "CREDIT";
    return Credit.TYPE;
  }

  @Override
  public String toString() {
    String operation = super.toString();
    return operation + ", { type=" + getType() + " }";
  }
}
