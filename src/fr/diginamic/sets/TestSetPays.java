package fr.diginamic.sets;

import static fr.diginamic.banque.Utils.frenchFormatter;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetPays {
  public static void main(String[] args) {
    Pays usa = new Pays("USA", 341814420, 81695);
    Pays france = new Pays("France", 64881830, 61157);
    Pays allemagne = new Pays("Allemagne", 83252474, 69338);
    Pays uk = new Pays("UK", 67961439, 58906);
    Pays italie = new Pays("Italie", 58697744, 58755);
    Pays japon = new Pays("Japon", 122631432, 50207);
    Pays chine = new Pays("Chine", 1425178782, 24558);
    Pays russie = new Pays("Russie", 143957079, 44104);
    Pays inde = new Pays("Inde", 1441719852, 10176);

    HashSet<Pays> setPays =
        new HashSet<>(
            Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));

    System.out.println("Affichage du set initial:");
    setPays.forEach(System.out::println);

    // Pays avec le PIB/habitant le plus important
    Pays paysPibHabMax = usa;
    // Pays avec le PIB total le plus important
    Pays paysPibTotalMax = france;
    Pays paysPibTotalMin = uk;
    for (Pays p : setPays) {
      if (p.getPibParHabitant() > paysPibHabMax.getPibParHabitant()) {
        paysPibHabMax = p;
      }

      if (p.getPibTotal() > paysPibTotalMax.getPibTotal()) {
        paysPibTotalMax = p;
      }

      if (p.getPibTotal() < paysPibTotalMin.getPibTotal()) {
        paysPibTotalMin = p;
      }
    }

    System.out.println(
        "\nLe pays avec le PIB par habitant le plus élevé est "
            + paysPibHabMax.getNom().toUpperCase()
            + " avec un PIB/hab = "
            + frenchFormatter.format(paysPibHabMax.getPibParHabitant()));

    System.out.println(
        "\nLe pays avec le PIB total le plus élevé est "
            + paysPibTotalMax.getNom().toUpperCase()
            + " avec un PIB total = "
            + frenchFormatter.format(paysPibTotalMax.getPibTotal()));

    System.out.println(
        "\nLe pays avec le PIB total le plus petit est "
            + paysPibTotalMin.getNom().toUpperCase()
            + " avec un PIB total = "
            + frenchFormatter.format(paysPibTotalMin.getPibTotal()));

    paysPibTotalMin.setNom(paysPibTotalMin.getNom().toUpperCase());

    System.out.println(
        "\nAffichage du set après mise en MAJUSCULE du pays au plus petit PIB total: ");
    setPays.forEach(System.out::println);

    // Suppression pays au plus petit PIB total
    setPays.remove(paysPibTotalMin);
    System.out.println("\nAffichage du set suppression du pays au plus petit PIB total: ");
    setPays.forEach(System.out::println);

    System.out.println("\nAffichage pays avec nom, nombre d'habitants et PIB total:");
    for (Pays p : setPays) {
      System.out.println(
          "Pays -> "
              + String.format("%-10s", p.getNom())
              + String.format("%15s", frenchFormatter.format(p.getNbHabitants()))
              + " habitants\t\t"
              + "PIB total = "
              + String.format("%19s", frenchFormatter.format(p.getPibTotal())));
    }
  }
}

// DONNEES UTILISÉES POUR LE PROGRAMME
// PAYS;Population totale;PIB/habitant en $US
// USA;341814420;81695
// FRANCE;64881830;61157
// ALLEMAGNE;83252474;69338
// UK;67961439;58906
// ITALIE;58697744;58755
// JAPON;122631432;50207
// CHINE;1425178782;24558
// RUSSIE;143957079;44104
// INDE;1441719852;10176
