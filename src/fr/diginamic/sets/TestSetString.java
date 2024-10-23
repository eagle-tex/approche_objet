package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {
  public static void main(String[] args) {
    HashSet<String> setPays =
        new HashSet<>(
            Arrays.asList(
                "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

    // Affichage set initial
    System.out.println("\nSet initial (" + setPays.size() + " éléments): " + setPays);

    // Recherche de la ville qui a le plus grand nombre de lettres
    String villeMaxLettres = "";
    for (String v : setPays) {
      if (v.length() > villeMaxLettres.length()) {
        villeMaxLettres = v;
      }
    }
    System.out.println(
        "\nLa ville avec le plus grand nombre de lettres est: '"
            + villeMaxLettres
            + "' avec "
            + villeMaxLettres.length()
            + " lettres.");

    // Suppression de ce pays (avec le plus grand nombre de lettres)
    setPays.remove(villeMaxLettres);
    System.out.println(
        "\nSet après suppression du pays avec le plus grand nombre de lettres ("
            + villeMaxLettres
            + ") - reste "
            + setPays.size()
            + " éléments: "
            + setPays);
  }
}
