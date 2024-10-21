package fr.diginamic.operations;

public class Operations {

  public static double calcul(double a, double b, char operateur) {
    double resultat = 0;
    switch (operateur) {
      case '+':
        resultat = a + b;
        break;
      case '-':
        resultat = a - b;
        break;
      case '*':
        resultat = a * b;
        break;
      case '/':
        if (b != 0) {
          resultat = a / b;
        } else {
          System.out.println("Attention: Division par 0 impossible");
          resultat = -1;
        }
        break;
      default:
        System.out.println("L'opérateur doit être +, -, * ou /");
        break;
    }
    return resultat;
  }
}
