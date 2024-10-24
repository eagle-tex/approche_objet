package fr.diginamic.combat;

public class Combat {
  Personnage personnage;
  Creature creature;

  public Combat() {
    this.personnage = new Personnage();
  }

  public void creerPersonnage() {
    //
  }

  public void combattre(Creature creature) {
    int typeCreature = Utils.obtenirNbAleatoire(1, 3);
    switch (typeCreature) {
      case 1:
        creature = new Loup();
        break;
      case 2:
        creature = new Gobelin();
        break;
      case 3:
        creature = new Troll();
        break;
      default:
        System.out.println("Choix invalide");
        break;
    }

    // Affichage de la créature rencontrée
    System.out.println("Vous rencontrer un " + creature.getType());
  }

  public void afficherScore() {
    System.out.println("Le score du personnage est actuellement de " + personnage.getScore());
  }
}
