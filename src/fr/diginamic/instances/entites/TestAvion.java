package fr.diginamic.instances.entites;

import java.time.LocalDate;
import java.time.Month;

public class TestAvion {
  public static void main(String[] args) {
    Avion avion1 = new Avion("AVION-01-BOEING", "Boeing", "747");
    Avion avion2 = new Avion("AVION-02-AIRBUS", "Airbus", "A340");

    Passager passager1 = new Passager("Cali", "Justine", "A1");
    Passager passager2 = new Passager("Verdeau", "Luc", "A2");
    Passager passager3 = new Passager("Anglin", "Jacques", "A3");
    Passager passager4 = new Passager("Limon", "Frédérique", "A4");

    Pilote pilote1 = new Pilote("Dupont", "Jean", LocalDate.of(2012, Month.OCTOBER, 17));
    Pilote pilote2 = new Pilote("Bateau", "Alice", LocalDate.of(2014, Month.FEBRUARY, 4));
    //      System.out.println(pilote1);
    //      System.out.println(pilote2);

    avion1.setPilote(pilote1);
    avion1.setPassagers(new Passager[] {passager1, passager2});
    System.out.println(avion1);

    avion2.setPilote(pilote2);
    avion2.setPassagers(new Passager[] {passager3, passager4});
    System.out.println(avion2);
  }
}
