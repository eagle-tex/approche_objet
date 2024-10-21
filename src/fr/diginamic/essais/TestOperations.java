package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestOperations {
  public static void main(String[] args) {
    //
    System.out.println("Réalisation d'opérations arithmétiques simples: +, -, *, /");

    // Demander à l'utilisateur de saisir un entier positif
    Scanner scanner = new Scanner(System.in);
    int option;
    double premier = 0.0;
    double second = 0.0;
    char operateur = ' ';

    while (true) {
      System.out.println();
      System.out.println("1. Utiliser le programme");
      System.out.println("2. Sortir du programme");
      System.out.print("Votre choix: ");

      try {
        option = scanner.nextInt();
      } catch (InputMismatchException ex) {
        System.err.println(">>> Veuillez entrer un entier svp");
        option = 0;
        scanner.nextLine();
      }

      if (option < 1 || option > 2) {
        System.out.println(">>> Veuillez saisir 1 ou 2");
      } else if (option == 1) {
        Scanner sc = new Scanner(System.in);
        // Saisie du premier nombre
        while (true) {
          System.out.print("Entrez le premier nombre: ");
          try {
            premier = sc.nextDouble();
            break;
          } catch (InputMismatchException ex) {
            System.err.println(">>> Veuillez entrer un nombre décimal svp");
            premier = 0.0;
            sc.nextLine();
          }
        }
        // Saisie du second nombre
        while (true) {
          System.out.print("Entrez le second nombre: ");
          try {
            second = sc.nextDouble();
            break;
          } catch (InputMismatchException ex) {
            System.err.println(">>> Veuillez entrer un nombre décimal svp");
            second = 0.0;
            sc.nextLine();
          }
        }
        // Saisie de l'opérateur
        while (true) {
          System.out.print("Entrez l'opérateur: ");
          try {
            operateur = sc.next().charAt(0);
            break;
          } catch (InputMismatchException ex) {
            System.err.println(">>> Veuillez entrer un nombre décimal svp");
            operateur = ' ';
            sc.nextLine();
          }
        }

        double resultat = Operations.calcul(premier, second, operateur);
        System.out.println(premier + " " + operateur + " " + second + " = " + resultat);
      } else { // option == 2
        System.out.println("\nFin du programme");
        return;
      }
    }
  }
}
