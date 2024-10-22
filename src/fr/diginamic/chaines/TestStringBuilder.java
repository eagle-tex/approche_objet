package fr.diginamic.chaines;

public class TestStringBuilder {
  public static void main(String[] args) {
    long debut = System.currentTimeMillis();
    chronometrerStringBuilder();
    long fin = System.currentTimeMillis();
    System.out.println("Temps écoulé en millisecondes : " + (fin - debut));

    long debutString = System.currentTimeMillis();
    chronometrerString();
    long finString = System.currentTimeMillis();
    System.out.println("Temps écoulé en millisecondes : " + (finString - debutString));
  }

  public static StringBuilder chronometrerStringBuilder() {
    StringBuilder builder = new StringBuilder();
    for (int i = 1; i <= 100000; i++) {
      builder.append(i);
    }
    return builder;
  }

  public static String chronometrerString() {
    String string = "";
    for (int i = 1; i <= 100000; i++) {
      string += i;
    }
    return string;
  }
}
