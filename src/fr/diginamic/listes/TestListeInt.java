package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeInt {
  public static void main(String[] args) {
    ArrayList<Integer> liste = new ArrayList<>();
    liste.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

    // Affichage des éléments de la liste
    System.out.println("Affichage de tous les éléments de la liste");
    System.out.println(liste);

    // Affichage de la taille de la liste
    System.out.println("\nTaille de la liste: " + liste.size());

    // Recherche et affichage du plus grand élément de la liste
    int plusGrandElement = Integer.MIN_VALUE;
    for (int nombre : liste) {
      plusGrandElement = Math.max(nombre, plusGrandElement);
    }
    System.out.println("\nLe plus grand élément de la liste est: " + plusGrandElement);

    // Suppression du plus petit élément de la liste et affichage de la liste
    Integer plusPetitElement = Integer.MAX_VALUE;
    for (int nombre : liste) {
      plusPetitElement = Math.min(nombre, plusPetitElement);
    }
    liste.remove(plusPetitElement);
    System.out.println(
        "\nListe après suppression du plus petit élément (" + plusPetitElement + "): " + liste);

    // Recherche de tous les éléments négatifs et transformation en positif
    Iterator<Integer> iterator = liste.iterator();
    System.out.println();
    for (int i = 0; i < liste.size(); i++) {
      int nombre = liste.get(i);
      if (nombre < 0) {
        System.out.println("Transformation de '" + nombre + "' en '" + Math.abs(nombre) + "'");
        liste.set(i, Math.abs(nombre));
      }
    }
    System.out.println("Liste après transformation des négatifs en positifs: " + liste);
  }
}
