package fr.diginamic.geometrie;

import fr.diginamic.banque.Utils;

/**
 * Liste les méthodes obligatoires que doit posséder un objet 3D
 *
 * @author DIGINAMIC
 */
public interface Objet3D extends ObjetGeometrique {
  /**
   * Retourne le volume d'un objet 3D
   *
   * @return double
   */
  double volume();

  /**
   * Affiche le volume d'une forme géométrique
   *
   * @return String
   */
  default String afficherVolume() {
    return Utils.formatterValeur(volume());
  }

  /** Affiche les informations d'un objet 3D */
  default void afficherInfos() {
    ObjetGeometrique.super.afficherInfos();
    System.out.println("Volume = " + afficherVolume());
  }
}
