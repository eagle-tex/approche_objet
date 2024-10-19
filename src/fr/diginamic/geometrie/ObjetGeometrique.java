package fr.diginamic.geometrie;

import fr.diginamic.banque.Utils;

/**
 * Liste les méthodes obligatoires que doit posséder un objet géométrique
 *
 * @author DIGINAMIC
 */
public interface ObjetGeometrique {
  /**
   * Retourne le périmètre d'une forme géométrique
   *
   * @return double
   */
  double perimetre();

  /**
   * Retourne la surface d'une forme géométrique
   *
   * @return double
   */
  double surface();

  /**
   * Affiche le périmètre d'une forme géométrique
   *
   * @return String
   */
  default String afficherPerimetre() {
    return Utils.formatterValeur(perimetre());
  }

  /**
   * Affiche la surface d'une forme géométrique
   *
   * @return String
   */
  default String afficherSurface() {
    return Utils.formatterValeur(surface());
  }
}
