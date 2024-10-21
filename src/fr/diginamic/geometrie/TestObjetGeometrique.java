package fr.diginamic.geometrie;

public class TestObjetGeometrique {

  public static void main(String[] args) {
    ObjetGeometrique[] tabObjetsGeo = new ObjetGeometrique[4];

    ObjetGeometrique cercle = new Cercle(10);
    ObjetGeometrique rectangle = new Rectangle(20, 10);
    ObjetGeometrique carre = new Carre(10);
    ObjetGeometrique sphere = new Sphere(10);

    tabObjetsGeo[0] = cercle;
    tabObjetsGeo[1] = rectangle;
    tabObjetsGeo[2] = carre;
    tabObjetsGeo[3] = sphere;

    for (ObjetGeometrique og : tabObjetsGeo) {
      og.afficherInfos();
      System.out.println("------------------------------");
    }

    Objet3D[] tabObj3D = new Objet3D[2];
    tabObj3D[0] = new Sphere(5);
    // tabObj3D[1] = new Cercle(4); // erreur, Cercle n'est pas un Objet3D
  }
}
