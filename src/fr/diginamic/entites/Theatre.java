package fr.diginamic.entites;

import fr.diginamic.banque.Utils;

public class Theatre {
  private String nom;
  private int capacite;
  private int totalClientsInscrits;
  private double recetteTotale;

  public Theatre(String nom, int capacite, int totalClientsInscrits, double recetteTotale) {
    this.nom = nom;
    this.capacite = capacite;
    this.totalClientsInscrits = totalClientsInscrits;
    this.recetteTotale = recetteTotale;
  }

  public Theatre(String nom, int capacite) {
    this.nom = nom;
    this.capacite = capacite;
  }

  private Theatre(Theatre th, String nouveauNom) {
    this.nom = nouveauNom;
    this.capacite = th.capacite;
    this.totalClientsInscrits = th.totalClientsInscrits;
    this.recetteTotale = th.recetteTotale;
  }

  public void inscrire(int nbClients, double prixPlace) {
    int capaciteDispo = nbClients;
    int clientsEnAttente = nbClients;
    if (getCapaciteRestante() >= nbClients) {
      System.out.println("*** Ajout de " + nbClients + " clients...");
      totalClientsInscrits += nbClients;
      recetteTotale += nbClients * prixPlace;
    } else { // (getCapaciteRestante() < nbClients)
      int capaciteRestante = getCapaciteRestante();
      System.out.println("*** Ajout de " + capaciteRestante + " clients sur " + nbClients + " ...");
      clientsEnAttente = nbClients - capaciteRestante;
      totalClientsInscrits += capaciteRestante;
      recetteTotale += capaciteRestante * prixPlace;
    }

    if (theatrePlein()) {
      System.out.println("Désolé, " + clientsEnAttente + " clients n'ont pas pu trouver de place");
    } else {
      System.out.println("Le théatre dispose encore de " + getCapaciteRestante() + " places.");
    }

    // Afficher la recette totale
    System.out.println(
        "La recette totale de l'établissement est de: " + Utils.formatterValeur(recetteTotale));
  }

  public boolean theatrePlein() {
    return !(capacite > totalClientsInscrits);
  }

  private int getCapaciteRestante() {
    return getCapacite() - getTotalClientsInscrits();
  }

  public String getNom() {
    return nom;
  }

  public int getCapacite() {
    return capacite;
  }

  public int getTotalClientsInscrits() {
    return totalClientsInscrits;
  }

  public double getRecetteTotale() {
    return recetteTotale;
  }

  @Override
  public String toString() {
    return "\nTheatre:"
        + "\n\tNom: "
        + nom.toUpperCase()
        + "\n\tCapacité totale: "
        + capacite
        + "\n\tNombre total d'inscrits: "
        + totalClientsInscrits
        + "\n\tRecette totale: "
        + Utils.formatterValeur(recetteTotale)
        + "\n";
  }
}
