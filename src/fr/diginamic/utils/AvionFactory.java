package fr.diginamic.utils;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Passager;
import fr.diginamic.instances.entites.Pilote;

public class AvionFactory {
  public static Avion getInstance(String marque, String modele, String immatriculation) {
    return new Avion(immatriculation, marque, modele);
  }

  public static Avion getInstance(
      String marque, String modele, String immatriculation, Pilote pilote, Passager[] passagers) {
    return new Avion(immatriculation, marque, modele, pilote, passagers);
  }

  public static Avion transfert(Avion avion1, Avion avion2) {
    Avion avionLeMoinsCharge;
    Avion avionLePlusCharge;
    if (avion1.getNombrePassagers() > avion2.getNombrePassagers()) {
      avionLePlusCharge = avion1;
      avionLeMoinsCharge = avion2;
    } else {
      avionLePlusCharge = avion2;
      avionLeMoinsCharge = avion1;
    }
    Passager[] passagersATransferer = avionLeMoinsCharge.getPassagers();

    avionLePlusCharge.ajouterPlusieursPassagers(passagersATransferer);

    // vider la liste des passagers de l'avion le moins chargé
    avionLeMoinsCharge.setPassagers(new Passager[0]);

    return avionLePlusCharge;
  }
}
