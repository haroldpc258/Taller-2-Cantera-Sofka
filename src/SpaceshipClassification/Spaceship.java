package SpaceshipClassification;

import java.util.Scanner;

/**
 * Clase abstracta que representa una nave espacial genérica.
 */
public abstract class Spaceship {
    protected String name; // Nombre de la nave
    protected String origin; // País de origen de la nave
    protected float weight; // Peso en kilogramos de la nave
    protected float height; // Altura en metros de la nave
    protected float power; // Caballos de potencia de la nave

    /**
     * Constructor que inicializa los atributos básicos de una nave espacial.
     * @param name Nombre de la nave.
     * @param origin País de origen de la nave.
     * @param weight Peso en kilogramos de la nave.
     * @param height Altura en metros de la nave.
     * @param power Caballos de potencia de la nave.
     */
    public Spaceship(String name, String origin, float weight, float height, float power){
        this.name = name;
        this.origin = origin;
        this.weight = weight;
        this.height = height;
        this.power = power;
    }

    /**
     * Método para solicitar información adicional de la nave al usuario.
     * Este método solicita información básica de la nave, y luego llama al método specificDataRequest
     * para solicitar información adicional específica de cada tipo de nave.
     * @param scanner Objeto Scanner utilizado para leer la entrada del usuario.
     */
    public void dataRequest(Scanner scanner) {
        System.out.println("\nIndique el Nombre de la nave:");
        this.name = scanner.nextLine();
        System.out.println("Indique el País de Origen de la nave:");
        this.origin = scanner.nextLine();
        System.out.println("Ingrese el Peso en Kilogramos de la nave:");
        this.weight = scanner.nextFloat();
        System.out.println("Ingrese la Altura en metros de la nave:");
        this.height = scanner.nextFloat();
        System.out.println("Ingrese los Caballos de Potencia de la nave:");
        this.power = scanner.nextFloat();
        scanner.nextLine();

        specificDataRequest(scanner);
    }

    /**
     * Método para mostrar la información de la nave.
     * Este método muestra la información básica de la nave, y luego llama al método specificDataDisplay
     * para mostrar información adicional específica de cada tipo de nave.
     */
    public void dataDisplay() {
        System.out.println("\nInfomación de la Nave.");
        System.out.println("Nombre: " + this.name);
        System.out.println("País de origen: " + this.origin);
        System.out.println("Peso en Kg: " + this.weight);
        System.out.println("Altura en m: " + this.height);
        System.out.println("Caballos de Potencia: " + this.power);

        specificDataDisplay();
    }

    /**
     * Método abstracto para solicitar información adicional específica de cada tipo de nave.
     * @param scanner Objeto Scanner utilizado para leer la entrada del usuario.
     */
    protected abstract void specificDataRequest(Scanner scanner);

    /**
     * Método abstracto para mostrar información adicional específica de cada tipo de nave.
     */
    public abstract void specificDataDisplay();

    /**
     * Método abstracto para hacer que la nave despegue.
     */
    public abstract void takeOff();

    /**
     * Método abstracto para hacer que la nave aterrice.
     */
    public abstract void land();

}
