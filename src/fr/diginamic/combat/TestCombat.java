package fr.diginamic.combat;

import java.util.Scanner;

public class TestCombat {
  public static void main(String[] args) {
    Personnage personnage = new Personnage();

    Scanner scanner = new Scanner(System.in);
    int choixMenuPrincipal = 0;
    boolean continuer = true;
    String menuPrincipal =
        """

            1. Créer le personnage\

            2. Combattre une créature\

            3. Prendre une potion\

            4. Afficher score\

            5. Sortir""";
    String promptMenuPrincipal = "Faites votre choix: ";
    String erreurNombreNonEntier = ">>> Veuillez à bien saisir un ENTIER";

    // Afficher le menu principal
    while (true) {
      choixMenuPrincipal =
          Utils.faireUnChoix(menuPrincipal, promptMenuPrincipal, erreurNombreNonEntier, 1, 5);

      switch (choixMenuPrincipal) {
        case 1:
          personnage = creerPersonnage();
          break;
        case 2:
          combattreCreature();
          break;
        case 3:
          prendrePotion();
          break;
        case 4:
          afficherScore(personnage);
          break;
        case 5:
          System.out.println("Sortir");
          return;
        default:
          System.out.println("Mauvais choix");
          break;
      }
    }
  }

  private static Personnage creerPersonnage() {
    System.out.println("\nCréation personnage");
    return new Personnage();
  }

  private static void combattreCreature() {
    System.out.println("Combattre une créature");
  }

  private static void prendrePotion() {
    System.out.println("Prendre une potion");
  }

  private static void afficherScore(Personnage p) {
    System.out.println("Affichage du score");
    System.out.println("Le score du personnage est " + p.getScore());
  }
}
