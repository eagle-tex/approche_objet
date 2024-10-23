package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
  public static void main(String[] args) {
    HashSet<Double> setDoubles =
        new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));

    // Affichage de tous les éléments de la collection
    //    setDoubles.forEach(System.out::println);
    System.out.println("\nSet initial (" + setDoubles.size() + " éléments): " + setDoubles);

    // Recherche du plus grand élément de la collection
    double plusGrand = Double.MIN_VALUE;
    for (Double d : setDoubles) {
      plusGrand = Math.max(d, plusGrand);
    }
    System.out.println("\nLe plus grand élément du set est: " + plusGrand);

    // Suppression du plus petit élément de la collection
    double plusPetit = Double.MAX_VALUE;
    for (double d : setDoubles) {
      plusPetit = Math.min(d, plusPetit);
    }
    System.out.println("\nLe plus petit élément du set est: " + plusPetit);

    Iterator<Double> iter = setDoubles.iterator();
    while (iter.hasNext()) {
      Double actuel = iter.next();
      if (actuel.equals(plusPetit)) {
        iter.remove();
      }
    }
    System.out.println(
        "Set après suppression du plus petit élément ("
            + setDoubles.size()
            + " éléments): "
            + setDoubles);
  }
}
