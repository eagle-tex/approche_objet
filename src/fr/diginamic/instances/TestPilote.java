package fr.diginamic.instances;

import fr.diginamic.instances.entites.Pilote;
import java.time.LocalDate;
import java.time.Month;

public class TestPilote {
  public static void main(String[] args) {
    Pilote pilote1 = new Pilote();
    Pilote pilote2 = new Pilote();

    pilote1.setNom("Jean");
    pilote1.setPrenom("Dupont");
    pilote1.setDateLicence(LocalDate.of(2012, Month.OCTOBER, 17));
    System.out.println(pilote1);

    pilote2.setNom("Alice");
    pilote2.setPrenom("Bateau");
    pilote2.setDateLicence(LocalDate.of(2014, Month.FEBRUARY, 4));
    System.out.println(pilote2);
  }
}
