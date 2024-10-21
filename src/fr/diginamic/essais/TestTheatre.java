package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
  public static void main(String[] args) {
    Theatre feuillants = new Theatre("Les Feuillants", 42, 24, 240);
    //    Theatre feuillants = new Theatre("Les Feuillants", 42);
    System.out.println(feuillants);

    feuillants.inscrire(15, 10);
    System.out.println(feuillants);

    feuillants.inscrire(9, 10);
    System.out.println(feuillants);
  }
}
