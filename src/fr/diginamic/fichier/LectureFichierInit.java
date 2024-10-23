package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichierInit {
  public static void main(String[] args) {
    Path origine =
        Paths.get("/home/gildas/Code/java/diginamic/approche_objet/src/fr/diginamic/fichier/");
    Path pathFichier = origine.resolve("recensement.csv");
    try {
      List<String> lignes = Files.readAllLines(pathFichier);
      int nbLignes = lignes.size();
      System.out.println("Le fichier lu comporte " + nbLignes + " lignes");
      // Affichage des 10 premières lignes
      for (int i = 0; i < 10; i++) {
        System.out.println(lignes.get(i));
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
