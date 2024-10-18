package fr.diginamic.instances.entites;

import java.util.Arrays;

public class Avion {
  String immatriculation;
  String marque;
  String modele;
  Pilote pilote;
  int nombrePassagersMax = 2;
  int nombrePassagers;
  Passager[] passagers = new Passager[nombrePassagersMax];

  public Avion(String immatriculation, String marque, String modele) {
    this.immatriculation = immatriculation;
    this.marque = marque;
    this.modele = modele;
    this.nombrePassagers = 0;
  }

  public Avion(
      String immatriculation, String marque, String modele, Pilote pilote, Passager[] passagers) {
    this(immatriculation, marque, modele);
    this.pilote = pilote;
    this.passagers = passagers;
    this.nombrePassagers = passagers.length;
  }

  public void afficherAttributsAvion() {
    System.out.println(this.toString());
  }

  public void ajouterUnPassager(Passager passager) {
    // on suppose que le passager est valide (a un nom, prénom et numéro de siège)
    // Vérifier s'il y a de place dans le tableau de passagers
    if (this.getNombrePassagers() < this.nombrePassagersMax) {
      // ajouter passager à l'index `nombrePassagers`
      passagers[nombrePassagers] = passager;
      nombrePassagers++; // préparer l'index pour le passager suivant
    } else {
      // agrandir le tableau, doubler sa taille
      passagers = Arrays.copyOf(passagers, nombrePassagersMax * 2);
      // ajouter le passager, puis incrémenter `nombrePassagers`
      passagers[nombrePassagers++] = passager;
    }
    String nomCompletPassager = passager.getNom() + " " + passager.getPrenom();
    System.out.println(
        "Le passager "
            + nomCompletPassager
            + " a bien été ajouté au siège "
            + passager.getNumeroSiege());
  }

  public void ajouterPlusieursPassagers(Passager[] passagers) {
    System.out.println("--- Ajout de " + passagers.length + " passager(s) ---");
    for (Passager passager : passagers) {
      ajouterUnPassager(passager);
    }
  }

  public String getImmatriculation() {
    return immatriculation;
  }

  public void setImmatriculation(String immatriculation) {
    this.immatriculation = immatriculation;
  }

  public String getMarque() {
    return marque;
  }

  public void setMarque(String marque) {
    this.marque = marque;
  }

  public String getModele() {
    return modele;
  }

  public void setModele(String modele) {
    this.modele = modele;
  }

  public Pilote getPilote() {
    return pilote;
  }

  public void setPilote(Pilote pilote) {
    this.pilote = pilote;
  }

  public Passager[] getPassagers() {
    Passager[] copyPassagers = Arrays.copyOf(passagers, passagers.length);
    return passagers;
  }

  public void setPassagers(Passager[] passagers) {
    this.passagers = passagers;
  }

  public int getNombrePassagers() {
    return nombrePassagers;
  }

  public int getNombrePassagersMax() {
    return nombrePassagersMax;
  }

  public void setNombrePassagersMax(int nombrePassagersMax) {
    this.nombrePassagersMax = nombrePassagersMax;
  }

  @Override
  public String toString() {
    return "Avion{"
        + "\n\timmatriculation="
        + immatriculation
        + "\n\tmarque="
        + marque
        + "\n\tmodèle="
        + modele
        + "\n\tpilote="
        + pilote
        + "\n\tpassagers="
        + Arrays.toString(passagers)
        + "\n\tNombre de passagers="
        + nombrePassagers
        + "\n}";
  }
}
