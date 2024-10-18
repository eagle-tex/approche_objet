package fr.diginamic.instances.entites;

import java.util.Arrays;

public class Avion {
  String immatriculation;
  String marque;
  String modele;
  Pilote pilote;
  Passager[] passagers;

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

  @Override
  public String toString() {
    return "Avion{"
        + "immatriculation='"
        + immatriculation
        + '\''
        + ", marque='"
        + marque
        + '\''
        + ", modele='"
        + modele
        + '\''
        + ", pilote="
        + pilote
        + ", passagers="
        + Arrays.toString(passagers)
        + '}';
  }

  public void setPassagers(Passager[] passagers) {
    this.passagers = passagers;
  }
}
