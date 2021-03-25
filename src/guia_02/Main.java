package guia_02;

import javax.swing.filechooser.FileSystemView;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {


    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int selected;

        do {
            selected = menu();
            switch (selected) {
                case 1:
                    Libro autor = new Libro();

                    System.out.println("Ingrese el nuevo nombre del libro ");
                    String nombre = scan.next();
                    autor.setTitulo(nombre);
                    System.out.println(autor.imprimeAutor());
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 2:


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
        System.out.println("\t   [4].Ejercicio 04.");
        System.out.println("\t   [5].Ejercicio 05.");

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