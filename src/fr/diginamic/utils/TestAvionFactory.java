package fr.diginamic.utils;

import fr.diginamic.instances.entites.Avion;
import fr.diginamic.instances.entites.Passager;
import fr.diginamic.instances.entites.Pilote;

import java.time.LocalDate;
import java.time.Month;

public class TestAvionFactory {
  public static void main(String[] args) {
    Passager passager1 = new Passager("Cali", "Justine", "A1");
    Passager passager2 = new Passager("Verdeau", "Luc", "A2");
    Passager passager3 = new Passager("Anglin", "Jacques", "A3");
    Passager passager4 = new Passager("Limon", "Frédérique", "A4");
    Passager passager5 = new Passager("Lee", "Paul", "A5");

    Pilote pilote1 = new Pilote("Dupont", "Jean", LocalDate.of(2012, Month.OCTOBER, 17));
    Pilote pilote2 = new Pilote("Bateau", "Alice", LocalDate.of(2014, Month.FEBRUARY, 4));

    Passager[] passagersAvion1 = new Passager[] {passager1, passager2, passager3};
    Passager[] passagersAvion2 = new Passager[] {passager4, passager5};

    Avion avion1 =
        AvionFactory.getInstance("AVION-01-BOEING", "Boeing", "747", pilote1, passagersAvion1);
    Avion avion2 =
        AvionFactory.getInstance("AVION-02-AIRBUS", "Airbus", "A340", pilote2, passagersAvion2);

    System.out.println("Avant transfert - Affichage avion 1");
    avion1.afficherAttributsAvion();
    System.out.println();

    System.out.println("Avant transfert - Affichage avion 2");
    avion2.afficherAttributsAvion();

    Avion avionTransfert = AvionFactory.transfert(avion1, avion2);

    System.out.println("Après transfert - Affichage avion 1");
    avion1.afficherAttributsAvion();
    System.out.println();

    System.out.println("Après transfert - Affichage avion 2");
    avion2.afficherAttributsAvion();
    System.out.println();

    System.out.println("Après transfert - Affichage avion Transfert");
    avionTransfert.afficherAttributsAvion();
    System.out.println();
  }
}

//    Avion avion1 = new Avion("AVION-01-BOEING", "Boeing", "747");
//    Avion avion2 = new Avion("AVION-02-AIRBUS", "Airbus", "A340");
//

//
//    Pilote pilote1 = new Pilote("Dupont", "Jean", LocalDate.of(2012, Month.OCTOBER, 17));
//    Pilote pilote2 = new Pilote("Bateau", "Alice", LocalDate.of(2014, Month.FEBRUARY, 4));
//    //      System.out.println(pilote1);
//    //      System.out.println(pilote2);
