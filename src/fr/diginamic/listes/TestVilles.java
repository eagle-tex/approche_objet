package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestVilles {
  public static void main(String[] args) {
    ArrayList<Ville> tabVilles = new ArrayList<>();

    tabVilles.addAll(
        Arrays.asList(
            new Ville("Nice", 343000),
            new Ville("Carcassonne", 47800),
            new Ville("Narbonne", 53400),
            new Ville("Lyon", 484000),
            new Ville("Foix", 9700),
            new Ville("Pau", 77200),
            new Ville("Marseille", 850700),
            new Ville("Tarbes", 40600)));

    System.out.println("Tableau initial: " + tabVilles.size() + " villes");
    tabVilles.forEach(System.out::println);

    // Recherche et affichage de la ville la plus peuplée
    Ville villeLaPlusPeuplee = new Ville("Ville inconnue", 0);
    int maxHabitants = 0;
    for (Ville v : tabVilles) {
      maxHabitants = Math.max(v.getNbHabitants(), maxHabitants);
      if (v.getNbHabitants() == maxHabitants) {
        villeLaPlusPeuplee = v;
      }
    }
    System.out.println(
        "\nLa ville la plus peuplée est '"
            + villeLaPlusPeuplee.getNom()
            + "' avec "
            + villeLaPlusPeuplee.getNbHabitants()
            + " habitants");

    // Suppression de la ville la moins peuplée
    Ville villeLaMoinsPeuplee = new Ville("Ville inconnue", 0);
    int minHabitants = Integer.MAX_VALUE;
    for (Ville v : tabVilles) {
      minHabitants = Math.min(v.getNbHabitants(), minHabitants);
    }
    //    System.out.println("\nMinimum habitants = " + minHabitants);

    Iterator<Ville> iter = tabVilles.iterator();
    while (iter.hasNext()) {
      Ville v = iter.next();
      if (v.getNbHabitants() == minHabitants) {
        System.out.println("\nVille la moins peuplée: " + v);
        iter.remove();
      }
    }
    System.out.println(
        "\nListe après suppression de la ville la moins peuplée: " + tabVilles.size() + " villes");
    tabVilles.forEach(System.out::println);

    // Modification des villes de plus de 100_000 habitants -> nom en majuscules
    int nbVillesModif = 0;
    for (int i = 0; i < tabVilles.size(); i++) {
      Ville actuelle = tabVilles.get(i);
      if (actuelle.getNbHabitants() >= 100_000) {
        actuelle.setNom(actuelle.getNom().toUpperCase());
        tabVilles.set(i, actuelle);
        nbVillesModif++;
      }
    }
    System.out.println(
        "\nListe après modification des villes de plus de 100_000 habitants: "
            + tabVilles.size()
            + " villes, "
            + nbVillesModif
            + " villes modifiées");
    tabVilles.forEach(System.out::println);
  }
}
