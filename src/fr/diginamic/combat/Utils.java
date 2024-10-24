package fr.diginamic.combat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
  /**
   * Génère un nombre aléatoire entre 2 valeurs (incluses)
   *
   * @param bas int (limite basse)
   * @param haut: int (limite haute)
   * @return int
   */
  public static int obtenirNbAleatoire(int bas, int haut) {
    return (int) Math.floor(Math.random() * (haut - bas + 1)) + bas;
  }

  /**
   * Génère un nombre aléatoire entre 1 et la valeur fournie (incluse)
   *
   * @param haut: int (limite haute)
   * @return int
   */
  public static int obtenirNbAleatoire(int haut) {
    return obtenirNbAleatoire(1, haut);
  }

  public static int faireUnChoix(String menu, String prompt, String err, int debut, int fin) {
    Scanner scanner = new Scanner(System.in);
    int entier = 0;
    boolean continuer = true;
    while (continuer) {
      System.out.println(menu);
      System.out.print(prompt);
      try {
        entier = scanner.nextInt();
      } catch (InputMismatchException ex) {
        System.err.println(err);
        entier = 0; // réinitialiser `entier`
        scanner.nextLine(); // récupérer le reste éventuel de la saisie et l'ignorer
        continue;
      }

      if (entier < debut || entier > fin) {
        System.out.println("\n>>> Veuillez choisir un entier entre " + debut + " et " + fin);
      } else {
        continuer = false; // sortir de la boucle
      }
    }
    return entier;
  }
}
