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
                    String linaje = r.next();

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
                    int familiaAgregar = 0;
                    System.out.println("Ingrese el nombre del aldeano");
                    String nombreAld = r.next();
                    System.out.println("Ingrese el apellido del aldeano");
                    String linaje = r.next();
                    for (int x = 0; x < familias.size(); x++) {
                        String nombre = "";
                        if (familias.get(x) instanceof Familia) {
                            nombre = ((Familia) familias.get(x)).getApellido();
                        }
                        if (linaje.equals(nombre)) {
                            familiaAgregar = x;
                        } else {
                            while (!linaje.equals(nombre)) {
                                System.out.println("Ingrese el apellido a uno de una familia que exista del aldeano");
                                linaje = r.next();
                                x = 0;

                            }
                        }
                    }
                    System.out.println("Ingrese la edad del aldeano");
                    int edad = r.nextInt();
                    System.out.println("Ingrese los puntos de vida del aldeano");
                    int pv = r.nextInt();
                    System.out.println("Ingrese la profesión del aldeano");
                    String profesion = r.next();
                    String respuesta = profesion.toLowerCase();
                    switch (respuesta) {
                        case "agronomo": {
                            Agronomo agronomo = new Agronomo(nombreAld, linaje, edad, pv);
                            familias.get(familiaAgregar).getAldeano().add(agronomo);
                            break;
                        }
                        case "explosivo": {
                            Explosivo explosivo = new Explosivo(nombreAld, linaje, edad, pv);
                            familias.get(familiaAgregar).getAldeano().add(explosivo);
                            break;
                        }
                        case "herrero": {
                            int valor = pv / 2;
                            pv = valor;

                            Herrero herrero = new Herrero(nombreAld, linaje, edad, pv);
                            familias.get(familiaAgregar).getAldeano().add(herrero);
                            break;
                        }

                        case "normales": {
                            Normales normales = new Normales(nombreAld, linaje, edad, pv);
                            familias.get(familiaAgregar).getAldeano().add(normales);
                            break;
                        }

                        case "pacifista": {
                            System.out.println("Ingrese el discurso del pacifista");
                            String discurso = r.nextLine();
                            r.nextLine();
                            Pacifista pacifista = new Pacifista(discurso, nombreAld, linaje, edad, pv);
                            familias.get(familiaAgregar).getAldeano().add(pacifista);
                            break;
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
