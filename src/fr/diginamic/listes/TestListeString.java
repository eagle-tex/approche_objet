package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {
  public static void main(String[] args) {
    ArrayList<String> villes =
        new ArrayList<>(
            Arrays.asList(
                "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

    // Recherche de la ville qui a le plus grand nombre de lettres
    String villeMaxLettres = "";
    for (String v : villes) {
      if (v.length() > villeMaxLettres.length()) {
        villeMaxLettres = v;
      }
    }
    System.out.println(
        "La ville avec le plus grand nombre de lettres est: '"
            + villeMaxLettres
            + "' avec "
            + villeMaxLettres.length()
            + " lettres.");

    // Modification de la liste : mettre tous les noms de ville en MAJUSCULES
    for (int i = 0; i < villes.size(); i++) {
      String v = villes.get(i);
      villes.set(i, v.toUpperCase());
    }
    System.out.println("\nListe avec tous les noms de villes en majuscules: " + villes);

    // Autre manière
    //    villes.replaceAll(String::toLowerCase);
    //    System.out.println("\nListe avec tous les noms de villes en minuscules: " + villes);

    // Suppression des villes dont le nom commence par 'N'
    Iterator<String> iterator = villes.iterator();
    while (iterator.hasNext()) {
      String ville = iterator.next();
      Character premiereLettre = ville.charAt(0);
      if ((Character.toLowerCase(ville.charAt(0))) == 'n') {
        iterator.remove();
      }
    }
    System.out.println(
        "\nListe après suppression des villes commençant par la lettre N: " + villes);
  }
}
