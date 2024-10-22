package fr.diginamic.maison;

import fr.diginamic.banque.Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maison {
  private List<Piece> pieces;
  private int nbEtages;
  private Set<Integer> etageSet;

  public Maison(List<Piece> pieces) {
    this();
    for (Piece p : pieces) {
      if (p != null) {
        this.pieces.add(p);
        etageSet.add(p.getEtage());
      }
    }
    setNbEtages(calculerNombreEtages());
  }

  public Maison() {
    this.pieces = new ArrayList<>();
    this.etageSet = new HashSet<>();
    etageSet.add(0);
    nbEtages = 1;
  }

  public Maison(Piece[] pieces) {
    this();
    this.pieces.forEach(this::ajouterPiece);
    setNbEtages(calculerNombreEtages());
  }

  public void ajouterPiece(Piece piece) {
    if (piece != null) {
      pieces.add(piece);
      etageSet.add(piece.getEtage());
      setNbEtages(calculerNombreEtages());
    }
  }

  private double calculerSuperficieTotale() {
    double superficieTotale = 0.0;
    for (Piece p : pieces) {
      superficieTotale += p.getSuperficie();
    }
    return superficieTotale;
  }

  private double calculerSuperficieUnEtage(int etage) {
    double superficieEtage = 0.0;
    for (Piece p : pieces) {
      if (p.getEtage() == etage) {
        superficieEtage += p.getSuperficie();
      }
    }
    return superficieEtage;
  }

  private double calculerSuperficieType(String typePiece) {
    double superficieType = 0.0;
    for (Piece p : getPieces()) {
      if (p.getType().equalsIgnoreCase(typePiece)) {
        superficieType += p.getSuperficie();
      }
    }
    return superficieType;
  }

  private int calculerNbPiecesType(String typePiece) {
    int nbPiecesTypes = 0;
    for (Piece p : getPieces()) {
      if (p.getType().equalsIgnoreCase(typePiece)) {
        nbPiecesTypes++;
      }
    }
    return nbPiecesTypes;
  }

  public void afficherInfosType(String typePiece) {
    if (calculerNbPiecesType(typePiece) > 0) {
      System.out.println(
          "Type '"
              + typePiece.toUpperCase()
              + "': nombre = "
              + calculerNbPiecesType(typePiece)
              + ", superficie globale = "
              + Utils.formatterValeur(calculerSuperficieType(typePiece))
              + " m²");
    } else {
      System.out.println(
          "Il n'y a pas de pièce de type '" + typePiece.toUpperCase() + "' dans cette maison.");
    }
  }

  public void afficherSuperficieTotale() {
    System.out.println(
        "Superficie totale " + Utils.formatterValeur(calculerSuperficieTotale()) + " m²");
  }

  public void afficherSuperficieUnEtage(int etage) {
    System.out.println(
        "Superficie étage "
            + etage
            + " ("
            + nomEtage(etage)
            + ") = "
            + Utils.formatterValeur(calculerSuperficieUnEtage(etage))
            + " m²");
  }

  private String nomEtage(int etage) {
    if (etage == 0) return "RDC";
    else if (etage > 0) return "R+" + etage;
    else return "R" + etage;
  }

  private int calculerNombreEtages() {
    return etageSet.size();
  }

  private int etageMin() {
    int minimum = 0;
    for (int etage : etageSet) {
      minimum = Math.min(minimum, etage);
    }
    return minimum;
  }

  public List<Piece> getPieces() {
    return new ArrayList<>(pieces);
  }

  private List<Piece> getPiecesParEtage() {
    List<Piece> piecesParEtageCroissant = new ArrayList<>();
    for (int i = etageMin(); i < nbEtages; i++) {
      List<Piece> piecesEtage = getPiecesUnEtage(i);
      piecesParEtageCroissant.addAll(piecesEtage);
    }
    return piecesParEtageCroissant;
  }

  private List<Piece> getPiecesUnEtage(int etage) {
    List<Piece> piecesEtage = new ArrayList<>();
    for (Piece p : getPieces()) {
      if (p.getEtage() == etage) {
        piecesEtage.add(p);
      }
    }
    return piecesEtage;
  }

  private void afficherPiecesUnEtage(int etage) {
    for (Piece p : getPiecesUnEtage(etage)) {
      System.out.println(p);
    }
  }

  private void afficherInfosUnEtage(int etage) {
    System.out.println(
        "--- Étage: "
            + etage
            + " ("
            + nomEtage(etage)
            + ") : "
            + getNbPiecesEtage(etage)
            + " pièces, superficie étage = "
            + Utils.formatterValeur(calculerSuperficieUnEtage(etage))
            + " m² ---");
  }

  public void afficherToutesPieces() {
    System.out.println("--------------------------------------------------");
    for (int etage = this.etageMin(); etage < nbEtages; etage++) {
      afficherPiecesUnEtage(etage);
      afficherInfosUnEtage(etage);
    }
  }

  public int getNbPieces() {
    return pieces.size();
  }

  private int getNbPiecesEtage(int etage) {
    return getPiecesUnEtage(etage).size();
  }

  public int getNbEtages() {
    return nbEtages;
  }

  private void setNbEtages(int nbEtages) {
    this.nbEtages = nbEtages;
  }

  public String toString() {
    return "\nMaison"
        + "\nNombre d'étages = "
        + getNbEtages()
        + "\nNombre de pièces: "
        + getNbPieces()
        + "\nSuperficie totale: "
        + Utils.formatterValeur(calculerSuperficieTotale())
        + " m²";
  }
}
