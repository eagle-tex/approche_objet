package fr.diginamic.geometrie;

public class TestObjetGeometrique {

  public static void main(String[] args) {
    ObjetGeometrique[] tabObjetsGeo = new ObjetGeometrique[3];

    ObjetGeometrique cercle = new Cercle(10);
    ObjetGeometrique rectangle = new Rectangle(20, 10);
    ObjetGeometrique carre = new Carre(10);

    tabObjetsGeo[0] = cercle;
    tabObjetsGeo[1] = rectangle;
    tabObjetsGeo[2] = carre;

    for (ObjetGeometrique og : tabObjetsGeo) {
      System.out.println(og);
      System.out.println("Périmètre = " + og.afficherPerimetre());
      System.out.println("Surface  = " + og.afficherSurface());
      System.out.println("------------------------------");
    }
  }
}
