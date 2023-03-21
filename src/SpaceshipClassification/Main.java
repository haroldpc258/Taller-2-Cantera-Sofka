package SpaceshipClassification;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que ejecuta el programa para creación de naves espaciales.
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     * @param args argumentos de la línea de comandos (no se usan en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista que almacena las naves espaciales creadas
        ArrayList<Spaceship> shipsInventory = new ArrayList<>();

        // Variable que indica si se deben seguir creando naves
        boolean create = true;

        while (create) {
            // Imprime en pantalla el menú con las opciones
            System.out.println("\n¿Qué tipo de nave desea crear?");
            System.out.println("1. Nave Espacial Tripulada");
            System.out.println("2. Nave Espacial no Tripulada");
            System.out.println("3. Vehículo Lanzadera");
            System.out.println("4. Nave de combate");
            System.out.println("0. Salir del programa");

            // Lee la opción elegida por el usuario
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    // Finaliza la ejecución del programa
                    System.out.println("Hasta pronto...");
                    create = false;
                    break;

                case 1:
                    // Crea una nave espacial tripulada vacía
                    Spaceship mannedShip = new Manned("", "", 0f, 0f, 0f, 0, "");
                    shipsInventory.add(mannedShip);

                    // Solicita al usuario que ingrese los datos de la nave espacial tripulada
                    mannedShip.dataRequest(scanner);

                    // Muestra los datos ingresados por el usuario
                    mannedShip.dataDisplay();
                    System.out.println("La Nave Espacial Tripulada se ha creado exitosamente...");
                    break;

                case 2:
                    // Crea una nave espacial no tripulada vacía
                    Spaceship unmannedShip = new Unmanned("", "", 0f, 0f, 0f, "", "");
                    shipsInventory.add(unmannedShip);

                    // Solicita al usuario que ingrese los datos de la nave espacial no tripulada
                    unmannedShip.dataRequest(scanner);

                    // Muestra los datos ingresados por el usuario
                    unmannedShip.dataDisplay();
                    System.out.println("La Nave Espacial No Tripulada se ha creado exitosamente...");
                    break;

                case 3:
                    // Crea un vehículo lanzadera vacío
                    Spaceship shuttleShip = new Shuttle("", "", 0f, 0f, 0f, "", 0f);
                    shipsInventory.add(shuttleShip);

                    // Solicita al usuario que ingrese los datos del vehículo lanzadera
                    shuttleShip.dataRequest(scanner);

                    // Muestra los datos ingresados por el usuario
                    shuttleShip.dataDisplay();
                    System.out.println("El vehículo lanzadera se ha creado exitosamente...");
                    break;

                case 4:
                    // Crea una nave espacial de combate vacía
                    Spaceship fighterShip = new Fighter("", "", 0f, 0f, 0f, "", true);
                    shipsInventory.add(fighterShip);

                    // Solicita al usuario que ingrese los datos de la nave espacial de combate
                    fighterShip.dataRequest(scanner);

                    // Muestra los datos ingresados por el usuario
                    fighterShip.dataDisplay();
                    System.out.println("La Nave Espacial de Combate se ha creado exitosamente...");
                    break;

                default:
                    // Opción no válida
                    System.out.println("Opción no válida. Intente de nuevo...");
                    break;
            }
        }
    }
}