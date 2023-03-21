package SpaceshipClassification;

import java.util.Scanner;

public class Shuttle extends Spaceship {
    private String navigationSystem;    // sistema de navegación de la nave
    private float transportCapacity;    // capacidad de transporte de la nave en Kg

    /**
     * Constructor de la clase Shuttle
     * @param name nombre de la nave
     * @param origin origen de la nave
     * @param weight peso de la nave
     * @param height altura de la nave
     * @param power potencia de la nave
     * @param navigationSystem sistema de navegación de la nave
     * @param transportCapacity capacidad de transporte de la nave en Kg
     */
    public Shuttle(String name, String origin, float weight, float height, float power, String navigationSystem, float transportCapacity) {
        super(name, origin, weight, height, power);
        this.navigationSystem = navigationSystem;
        this.transportCapacity = transportCapacity;
    }

    /**
     * Método para descargar la carga de la nave
     */
    public void download() {
        System.out.println("Se ha descargado correctamente la carga...");
    }

    /**
     * Método que solicita datos específicos de la nave al usuario
     * @param scanner objeto Scanner para solicitar información al usuario
     */
    @Override
    protected void specificDataRequest(Scanner scanner) {
        System.out.println("Indique el Sistema de Navegación de la Nave: ");
        this.navigationSystem = scanner.nextLine();
        System.out.println("Ingrese la Capacidad de Transporte de la Nave en Kg: ");
        this.transportCapacity = scanner.nextFloat();
    }

    /**
     * Método que muestra los datos específicos de la nave
     */
    @Override
    public void specificDataDisplay() {
        System.out.println("Sistema de Navegación: " + this.navigationSystem);
        System.out.println("Capacidad de Transporte (Kg): " + this.transportCapacity);
    }

    /**
     * Método para indicar que la nave ha despegado
     */
    @Override
    public void takeOff() {
        System.out.println("El vehículo lanzadera ha despegado...");
    }

    /**
     * Método para indicar que la nave ha aterrizado
     */
    @Override
    public void land(){
        System.out.println("El vehículo lanzadera ha aterrizado...");
    }
}