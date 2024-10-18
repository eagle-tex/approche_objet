package fr.diginamic.instances.entites;

public class TestAvion {
  public static void main(String[] args) {
    Avion avion1 = new Avion();
    Avion avion2 = new Avion();

    avion1.setPilote(new Pilote());
    avion1.setPassagers(new Passager[] {new Passager(), new Passager()});
    System.out.println(avion1);

    avion2.setPilote(new Pilote());
    avion2.setPassagers(new Passager[] {new Passager(), new Passager()});
    System.out.println(avion2);
  }
}
