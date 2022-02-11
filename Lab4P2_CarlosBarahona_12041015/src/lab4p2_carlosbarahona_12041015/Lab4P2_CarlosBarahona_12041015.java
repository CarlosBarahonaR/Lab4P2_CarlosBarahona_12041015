/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlosbarahona_12041015;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab4P2_CarlosBarahona_12041015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Aldeano> aldeanos = new ArrayList();
        Familia montesco = new Familia("Montesco", aldeanos);
        Familia capuleto = new Familia("Capuleto", aldeanos);
        Familia farnese = new Familia("Farnese", aldeanos);

        montesco.getAldeano().add(new SuperGranjero("Romeo", "Montesco", 18, 1000));
        montesco.getAldeano().add(new Herrero("Josue", "Montesco", 20, 500));
        montesco.getAldeano().add(new Agronomo("Farquad", "Montesco", 24, 100));

        capuleto.getAldeano().add(new Herrero("Fernando", "Capuleto", 28, 500));
        capuleto.getAldeano().add(new Agronomo("Ricardo", "Capuleto", 25, 100));

        farnese.getAldeano().add(new Herrero("Jose", "Farnese", 28, 500));
        farnese.getAldeano().add(new Agronomo("Julio", "Farnese", 25, 100));

        Scanner r = new Scanner(System.in);
        ArrayList<Familia> familias = new ArrayList();
        familias.add(montesco);
        familias.add(capuleto);
        familias.add(farnese);
        int opcion = 12;
        while (opcion != 0) {
            System.out.println("Bienvenido a Pelea de Terrenos, solo que el terreno es Julieta\n"
                    + "¿Qué desea hacer?\n"
                    + "0) Salir\n"
                    + "1) Crear Familia\n"
                    + "2) Crear Aldeano\n"
                    + "3) Imprimir Familias\n"
                    + "4) Pelear\n");
            opcion = r.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el linaje de la familia");
                    String linaje = r.nextLine();
                    r.nextLine();
                    for (int x = 0; x < familias.size(); x++) {
                        String nombre = "";
                        if (familias.get(x) instanceof Familia) {
                            nombre = ((Familia) familias.get(x)).getApellido();
                        }
                        while (linaje.equals(nombre)) {
                            System.out.println("Ingrese el nombre cientifico del animal");
                            linaje = r.nextLine();
                            r.nextLine();
                        }
                    }
                    ArrayList<Aldeano> aldeano = new ArrayList();
                    familias.add(new Familia(linaje, aldeano));
                    break;
                }

                case 2: {
                    int opcion2 = 0;
                    while (opcion2 != 3) {
                        System.out.println("¿Qué desea hacer?\n"
                                + "1) Modificar atributo en especifico de animal\n"
                                + "2) Modificar animal entero\n"
                                + "3) Salir");
                        opcion2 = r.nextInt();
                        switch (opcion2) {
                            case 1: {

                                System.out.println("Ingrese el nombre cientifico del animal para buscarlo");
                                String nombreCientifico = r.nextLine();
                                r.nextLine();

                                int item2 = 0;

                                for (int z = 0; z < animales.size(); z++) {
                                    String nc = "";
                                    if (animales.get(z) instanceof Animales) {
                                        nc = ((Animales) animales.get(z)).getNombreCientifico();
                                    }
                                    if (nombreCientifico.equals(nc)) {
                                        item2 = z;
                                        z = animales.size();
                                    } else {
                                        item2 = 100000;
                                    }
                                }
                                if (item2 <= animales.size()) {
                                    if (animales.get(item2) instanceof Animales) {
                                        System.out.println("¿Que desea modificar?\n"
                                                + "1) Nombre cientifico \n"
                                                + "2) Nombre comun \n"
                                                + "3) Habitat \n"
                                                + "4) Alimentacion \n"
                                                + "5) Descripcion de rasgos \n"
                                                + "6) Distribucion geografica \n"
                                                + "7) Vida\n"
                                                + "8) Salir");

                                        int opcion3 = r.nextInt();

                                        while (opcion3 != 8) {
                                            switch (opcion3) {
                                                case 1: {

                                                    System.out.println("Ingrese el nombre cientifico del animal");
                                                    String nombreCientifico3 = r.nextLine();

                                                    for (int x = 0; x < animales.size(); x++) {
                                                        String nombre = "";
                                                        if (animales.get(x) instanceof Animales) {
                                                            nombre = ((Animales) animales.get(x)).getNombreCientifico();
                                                        }
                                                        while (nombreCientifico3.equals(nombre)) {
                                                            System.out.println("Ingrese el nombre cientifico del animal");
                                                            nombreCientifico3 = r.nextLine();
                                                        }
                                                    }

                                                    ((Animales) animales.get(item2)).setNombreCientifico(nombreCientifico3);

                                                }

                                                case 2: {

                                                    ((Animales) animales.get(item2)).setNombreComun(r.nextLine());
                                                    r.nextLine();
                                                }
                                                case 3: {

                                                    ((Animales) animales.get(item2)).setHabitat(r.nextLine());
                                                    r.nextLine();

                                                }
                                                case 4: {

                                                    ((Animales) animales.get(item2)).setAlimentacion(r.nextLine());
                                                    r.nextLine();
                                                }
                                                case 5: {

                                                    ((Animales) animales.get(item2)).setDescripcionRasgos(r.nextLine());
                                                    r.nextLine();

                                                }
                                                case 6: {

                                                    ((Animales) animales.get(item2)).setDescripcionRasgos(r.nextLine());
                                                    r.nextLine();
                                                }
                                                case 7: {

                                                    System.out.println("Ingrese la vida del animal");
                                                    int vida = r.nextInt();

                                                    for (int y = 0; y < animales.size(); y++) {
                                                        int vida2 = 0;
                                                        if (animales.get(y) instanceof Animales) {
                                                            vida2 = ((Animales) animales.get(y)).getVida();
                                                        }
                                                        while (vida2 == vida) {
                                                            System.out.println("Ingrese la vida del animal");
                                                            vida = r.nextInt();
                                                        }
                                                    }
                                                    ((Animales) animales.get(item2)).setVida(r.nextInt());
                                                }

                                            }
                                        }
                                    }

                                } else {
                                    System.out.println("No se encontro el animal que se buscaba");
                                }

                            }

                            case 2: {

                                System.out.println("Ingrese la posicon de la lista del animal que desea modificar");
                                int posicion = r.nextInt();
                                r.nextLine();

                                System.out.println("Ingrese el nombre cientifico del animal");
                                String nombreCientifico3 = r.nextLine();

                                for (int f = 0; f < animales.size(); f++) {
                                    String nombre = "";
                                    if (animales.get(f) instanceof Animales) {
                                        nombre = ((Animales) animales.get(f)).getNombreCientifico();
                                    }
                                    while (nombreCientifico3.equals(nombre)) {
                                        System.out.println("Ingrese el nombre cientifico del animal");
                                        nombreCientifico3 = r.nextLine();
                                    }
                                }
                                r.nextLine();
                                System.out.println("Ingrese el nombre comun del animal");
                                String nombreComun3 = r.nextLine();
                                r.nextLine();
                                System.out.println("Ingrese el habitat del animal");
                                String habitat3 = r.nextLine();
                                r.nextLine();
                                System.out.println("Ingrese la alimentación del animal");
                                String alimentacion3 = r.nextLine();
                                r.nextLine();
                                System.out.println("Ingrese la descripcion del animal");
                                r.nextLine();
                                String descripcion3 = r.nextLine();
                                System.out.println("Ingrese distribucion geografica del animal");
                                String puesto3 = r.nextLine();
                                r.nextLine();
                                System.out.println("Ingrese la vida del animal");
                                int vida = r.nextInt();

                                for (int j = 0; j < animales.size(); j++) {
                                    int vida2 = 0;
                                    if (animales.get(j) instanceof Animales) {
                                        vida2 = ((Animales) animales.get(j)).getVida();
                                    }
                                    while (vida2 == vida) {
                                        System.out.println("Ingrese la vida del animal");
                                        vida = r.nextInt();
                                    }
                                }

                                Animales animal = new Animales(nombreCientifico3, nombreComun3, habitat3, alimentacion3, descripcion3, puesto3, vida);

                                try {

                                    animales.set(posicion, animal);
                                } catch (Exception e) {
                                    System.out.println("La posición establecida para modificar no existe.");
                                }

                            }
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("¿Como desea imprimir?\n"
                            + "1) Imprimir por posicion de la lista \n"
                            + "2) Imprimir lista completa \n"
                            + "3) Imprimir por nombre científico \n"
                            + "4) Salir");

                    int opcion3 = r.nextInt();

                    while (opcion3 != 4) {
                        switch (opcion3) {
                            case 1: {
                                System.out.println("Ingrese la posicon de la lista del animal que desea imprimir");
                                int posicion = r.nextInt();

                                try {

                                    System.out.println(animales.get(posicion));
                                } catch (Exception e) {
                                    System.out.println("La posición establecida para imprimir no existe.");
                                }
                                break;
                            }
                            case 2: {
                                for (int u = 0; u < animales.size(); u++) {
                                    if (animales.get(u) instanceof Animales) {
                                        System.out.println(animales.get(u));

                                    }
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Ingrese el nombre cientifico del animal para buscarlo");
                                String nombreCientifico = r.nextLine();
                                r.nextLine();

                                int item2 = 0;

                                for (int z = 0; z < animales.size(); z++) {
                                    String nc = "";
                                    if (animales.get(z) instanceof Animales) {
                                        nc = ((Animales) animales.get(z)).getNombreCientifico();
                                    }
                                    if (nombreCientifico.equals(nc)) {
                                        item2 = z;
                                        z = animales.size();
                                    } else {
                                        item2 = 100000;
                                    }
                                }
                                if (item2 <= animales.size()) {
                                    if (animales.get(item2) instanceof Animales) {
                                        System.out.println(animales.get(item2));
                                    }
                                }
                                break;
                            }
                        }

                        break;
                    }
                }

                case 4: {
                    System.out.println("Ingrese la posicon del animal que se alimentara");
                    int posicion = r.nextInt();
                    System.out.println("Ingrese la posicon del animal que sera devorado");
                    int posicion2 = r.nextInt();

                    try {

                        int vida = animales.get(posicion).getVida();
                        int vida2 = animales.get(posicion2).getVida();
                        animales.get(posicion).setVida(vida + vida2);
                        animales.remove(posicion2);
                    } catch (Exception e) {
                        System.out.println("Una de las posiciones establecidas no existe.");
                    }

                    break;
                }

            }
        }
    }
}
