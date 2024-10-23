package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LectureFichier {
  public static void main(String[] args) {
    ArrayList<Ville> listeVilles = new ArrayList<>();

    Path origine =
        Paths.get("/home/gildas/Code/java/diginamic/approche_objet/src/fr/diginamic/fichier/");
    Path pathFichier = origine.resolve("recensement.csv");

    try {
      List<String> lignes = Files.readAllLines(pathFichier);
      // Supprimer la première ligne qui est l'entête
      lignes.removeFirst();
      int nbLignes = lignes.size();
      System.out.println("Le fichier lu comporte " + nbLignes + " villes");

      // Traiter les lignes pour en récupérer les infos nécessaires à la création des villes
      for (String l : lignes) {
        String[] tokens = l.split(";");
        String nomVille = tokens[6];
        String codeDept = tokens[2];
        String nomRegion = tokens[1];
        int popTotale = Integer.parseInt(tokens[9].replace(" ", ""));
        listeVilles.add(new Ville(nomVille, codeDept, nomRegion, popTotale));
      }

      // Affichage d'une ville
      System.out.println("\nAffichage ville numéro 4383 (qui devrait être Marseille)");
      System.out.println(listeVilles.get(4382)); // Marseille

      // Demande nombre habitants minimum, pour trouver les villes ayant plus d'habitants
      System.out.print("Veuillez entrer un nombre d'habitants minimum: ");
      Scanner scanner = new Scanner(System.in);
      int nbHabMin = scanner.nextInt();

      ArrayList<Ville> villesPlusDeNHabs = new ArrayList<>();
      for (Ville v : listeVilles) {
        if (v.getPopulationTotale() > nbHabMin) {
          villesPlusDeNHabs.add(v);
        }
      }
      System.out.println("\nTraitement des villes de plus de " + nbHabMin + " habitants ...");
      System.out.println(
          "Il y a " + villesPlusDeNHabs.size() + " villes de plus de " + nbHabMin + " habitants");

      // Créer un nouveau fichier - villesPopulationSupN_K.csv
      String nomFichier = "villesPopulationSup" + (nbHabMin / 1000) + "K.csv";
      Path pathVillesPopSup25K = origine.resolve(nomFichier);
      if (Files.exists(pathVillesPopSup25K)) {
        // supprimer le fichier existant
        System.out.println(">> Fichier '" + nomFichier + "' existant supprimé");
        Files.delete(pathVillesPopSup25K);
      }

      System.out.println(">> Le fichier '" + nomFichier + "' n'existe pas/plus. On va le créer");

      // Générer et remplir la liste de Strings à écrire
      List<String> lignesAEcrire = new ArrayList<>();
      lignesAEcrire.add("Nom de la commune;Code département;Nom de la région;Population totale");
      for (Ville v : villesPlusDeNHabs) {
        String ligne =
            v.getNom()
                + ";"
                + v.getCodeDept()
                + ";"
                + v.getNomRegion()
                + ";"
                + v.getPopulationTotale();
        lignesAEcrire.add(ligne);
      }
      // Écriture des informations des villes de plus de 25000 habitants dans le fichier
      System.out.println(lignesAEcrire.size() + " lignes à écrire");
      Files.write(pathVillesPopSup25K, lignesAEcrire);
      System.out.println(lignesAEcrire.size() + " lignes ont été écrites dans le fichier");

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
