package fr.diginamic.instances.entites;

import java.time.LocalDate;
import java.time.Month;

public class TestAvion {
  public static void main(String[] args) {
    Avion avion1 = new Avion();
    Avion avion2 = new Avion();

    Passager passager1 = new Passager();
    passager1.setNom("Cali");
    passager1.setPrenom("Justine");
    passager1.setNumeroSiege("A1");

    Passager passager2 = new Passager();
    passager2.setNom("Verdeau");
    passager2.setPrenom("Luc");
    passager2.setNumeroSiege("A2");

    Passager passager3 = new Passager();
    passager3.setNom("Anglin");
    passager3.setPrenom("Jacques");
    passager3.setNumeroSiege("A3");

    Passager passager4 = new Passager();
    passager4.setNom("Limon");
    passager4.setPrenom("Frédérique");
    passager4.setNumeroSiege("A4");

    Pilote pilote1 = new Pilote();
    pilote1.setNom("Jean");
    pilote1.setPrenom("Dupont");
    pilote1.setDateLicence(LocalDate.of(2012, Month.OCTOBER, 17));
    //      System.out.println(pilote1);

    Pilote pilote2 = new Pilote();
    pilote2.setNom("Alice");
    pilote2.setPrenom("Bateau");
    //      pilote2.setDateLicence(LocalDate.of(2014, Month.FEBRUARY, 4));

    avion1.setMarque("Boeing");
    avion1.setModele("747");
    avion1.setImmatriculation("AVION-01-BOEING");
    avion1.setPilote(pilote1);
    avion1.setPassagers(new Passager[] {passager1, passager2});
    System.out.println(avion1);

    avion2.setMarque("Airbus");
    avion2.setModele("A340");
    avion2.setImmatriculation("AVION-02-AIRBUS");
    avion2.setPilote(pilote2);
    avion2.setPassagers(new Passager[] {passager3, passager4});
    System.out.println(avion2);
  }
}
