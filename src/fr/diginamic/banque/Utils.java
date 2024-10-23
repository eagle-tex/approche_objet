package fr.diginamic.banque;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
  public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");

  public static final NumberFormat frenchFormatter = NumberFormat.getInstance(Locale.FRANCE);

  public static DecimalFormatSymbols getBigDecimalFormat() {
    DecimalFormatSymbols BIG_DECIMAL_FORMAT = new DecimalFormatSymbols();
    BIG_DECIMAL_FORMAT.setDecimalSeparator(',');
    BIG_DECIMAL_FORMAT.setGroupingSeparator(' ');
    return BIG_DECIMAL_FORMAT;
  }

  public static String formatterValeur(double valeur) {
    return DECIMAL_FORMAT.format(valeur);
  }

  private static String deviseAvecLocalisation(BigDecimal montant, Locale locale) {
    NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
    return nf.format(montant);
  }

  public static String deviseFrance(BigDecimal montant) {
    return deviseAvecLocalisation(montant, Locale.of("fr", "FR"));
  }

  public static BigDecimal strToBigDecimal(String montant) {
    return new BigDecimal(montant).setScale(2, RoundingMode.UP);
  }

  public static boolean validerValeurPositive(double valeur) {
    return valeur > 0;
  }

  public static void main(String[] args) {
    double val = -5;
    System.out.println(validerValeurPositive(val));
  }
}
