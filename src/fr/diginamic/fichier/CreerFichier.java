package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
  public static void main(String[] args) {
    Path origine =
        Paths.get("/home/gildas/Code/java/diginamic/approche_objet/src/fr/diginamic/fichier/");
    Path pathSrc = origine.resolve("recensement.csv");
    try {
      List<String> lines = Files.readAllLines(pathSrc);
      Path pathDest = origine.resolve("copy100FirstLines.csv");

      // Copier les 100 premières lignes du fichier dans un nouveau tableau
      List<String> lignesACopier = new ArrayList<>();
      for (int i = 0; i < 100; i++) {
        lignesACopier.add(lines.get(i));
      }

      // Écrire les 100 lignes dans un nouveau fichier
      Files.write(pathDest, lignesACopier);

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
