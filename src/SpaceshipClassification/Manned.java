package SpaceshipClassification;

import java.util.Scanner;

/**
 * La clase Manned representa una nave espacial tripulada con atributos como el número de tripulantes y la misión asignada.
 * Hereda de la clase Spaceship y agrega sus propios atributos y métodos específicos.
 */
public class Manned extends Spaceship{
    private int crewNumber; // el número de tripulantes de la nave
    private String mission; // la misión asignada a la nave

    /**
     * El constructor de la clase Manned que inicializa los atributos heredados y propios.
     * @param name el nombre de la nave
     * @param origin el origen de la nave
     * @param weight el peso de la nave
     * @param height la altura de la nave
     * @param power el poder de la nave
     * @param crewNumber el número de tripulantes de la nave
     * @param mission la misión asignada a la nave
     */
    public Manned(String name, String origin, float weight, float height, float power, int crewNumber, String mission){
        super(name, origin, weight, height, power);
        this.crewNumber = crewNumber;
        this.mission = mission;
    }

    /**
     * El método spaceWalk imprime un mensaje indicando que la nave está lista para la caminata espacial.
     */
    public void spaceWalk(){
        System.out.println("Sistemas listos y compuertas abiertas para que los astronautas ejecuten la caminata espacial...");
    }

    /**
     * El método specificDataRequest permite al usuario ingresar el número de tripulantes y la misión de la nave mediante la entrada del escáner.
     * @param scanner el objeto Scanner que se utiliza para leer la entrada del usuario.
     */
    @Override
    public void specificDataRequest(Scanner scanner) {
        System.out.println("Ingrese el número de tripulantes que habitarán la Nave:");
        this.crewNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Indique la misión asignada a la nave: ");
        this.mission = scanner.nextLine();
    }

    /**
     * El método specificDataDisplay imprime el número de tripulantes y la misión de la nave.
     */
    @Override
    public void specificDataDisplay() {
        System.out.println("Número de tripulantes: " + this.crewNumber);
        System.out.println("Misión: " + this.mission);
    }

    /**
     * El método takeOff imprime un mensaje indicando que la nave tripulada ha despegado.
     */
    @Override
    public void takeOff() {
        System.out.println("La nave espacial tripulada ha despegado...");
    }

    /**
     * El método land imprime un mensaje indicando que la nave tripulada ha aterrizado.
     */
    @Override
    public void land(){
        System.out.println("La nave espacial tripulada ha aterrizado...");
    }


}
