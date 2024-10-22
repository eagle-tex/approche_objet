package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
  public static void main(String[] args) {

    Maison maison = new Maison();
    System.out.println(maison);
    maison.afficherToutesPieces();
    System.out.println();

    maison.ajouterPiece(new Salon(0, 25.0));
    maison.ajouterPiece(new Cuisine(0, 10.0));
    maison.ajouterPiece(new WC(0, 2.0));
    maison.ajouterPiece(new Chambre(1, 12.0));
    maison.ajouterPiece(new Chambre(1, 10.0));
    maison.ajouterPiece(new SalleDeBain(1, 5.0));
    maison.ajouterPiece(new WC(1, 2.0));
    maison.ajouterPiece(null); // n'est pas ajoutée
    // maison.ajouterPiece(new Chambre(-2, 16.0)); // ETAGE négatif non accepté
    // maison.ajouterPiece(new Chambre(0, -10.0)); // SUPERFICIE négative non acceptée
    maison.ajouterPiece(new Chambre(2, 16.0));
    System.out.println(maison);
    maison.afficherToutesPieces();

    System.out.println();
    maison.afficherInfosType("chambre");
    System.out.println();
    maison.afficherInfosType("SALON");
    System.out.println();
    maison.afficherInfosType("Cinéma");
  }
}
