package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {
  public static void main(String[] args) {
    ArrayList<Integer> listeEntiers = new ArrayList<>();

    for (int i = 1; i <= 100; i++) {
      listeEntiers.add(i);
    }

    System.out.println("La liste créée est de taille " + listeEntiers.size());
  }
}
