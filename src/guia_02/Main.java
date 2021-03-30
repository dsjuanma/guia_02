package guia_02;

import java.util.Arrays;
import java.util.Scanner;



public class Main {


    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int selected;

        do {
            selected = menu();
            switch (selected) {
                case 1:
                    Autor Joshua = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');

                    Autor[] autores = new Autor[10];
                    autores[0] = Joshua;
                    System.out.println("Autor Princial");
                    System.out.print(Joshua);
                    System.out.println("\n");
                    Libro libro = new Libro("Effective Java", 450, 150, autores);
                    // System.out.println("Datos iniciales del Libro\n");
                    System.out.println(libro);
                    System.out.println("\n");

                    //libro.cambioPrecio();
                    // libro.cambioStock();
                    /*


                    System.out.println(Arrays.toString(libro.getAutor()));
                    System.out.println("\n");

                   // System.out.println(libro.mostrarMensaje());

                    Autor autor1 = new Autor("Alan", "Brado", "Semtex@gmail.com", 'M');
                    Autor autor2 = new Autor("Esteban", "Kito", "demadera@hotmail.com", 'M');

                    autores[1] = autor1;
                    autores[2] = autor2;

                    Libro libro1 = new Libro("Effective Java", 500, 200, autores);
                    System.out.println(libro1);

                     */
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 2:
                    Cliente aron = new Cliente("Aron", "nassa@gmail.com", 0.20);
                    System.out.println(aron.toString());
                    Factura nuevoCliente = new Factura(aron, 13000);
                    System.out.println(nuevoCliente.toString());
                    Venta nuevaVenta = new Venta("Pan","Pan rallado",200);
                    Venta nuevaVenta2 = new Venta("Leche","Leche descremada",300);
                    System.out.println(nuevaVenta.toString());
                    System.out.println(nuevaVenta2.toString());


                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 3:

                    Pausa.pausar();
                    limpiarPantalla();

                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    limpiarPantalla();
                    System.out.println("¡¡¡Ejercicio Inexistente.!!!");
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
            }
        } while (selected != 0);
    }


    public static int menu() { // Menu
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t    GUIA 00: INTRODUCCION A JAVA.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t    MENU");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t   [1].Ejercicio 01.");
        System.out.println("\t   [2].Ejercicio 02.");
        System.out.println("\t   [3].Ejercicio 03.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t   [0].Salir del programa.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n\n\t  Elija una opcion: ");
        System.out.println("\n");
        int input = scan.nextInt();
        return input;
    }


    public static void limpiarPantalla() {         // se dejan 60 espacios creando una especie de cls de la consola
        for (int i = 0; i < 2; i++) {
            System.out.println("\n");
        }
    }


    public static class Pausa {
        public static void pausar() {
            System.out.println("\n");
            System.out.println(" ----------------------------------------");
            System.out.println("|Presionar la tecla ENTER para continuar.|");
            System.out.println(" ----------------------------------------");
            Scanner aceptar = new Scanner(System.in);
            System.out.println("\n");
            aceptar.nextLine(); // queda esperando que precionemos la tecla enter para continuar
        }
    }
}