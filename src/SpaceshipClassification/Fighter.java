package SpaceshipClassification;
import java.util.Scanner;

/**
 * Esta clase representa una nave de combate.
 * Extiende de la clase Spaceship y hereda sus atributos y métodos abstractos.
 * Implementa los métodos abstractos especificos de la nave de combate.
 */
public class Fighter extends Spaceship{
    private String primaryWeapon;
    private boolean shieldActivation;

    /**
     * Constructor de la clase Fighter.
     * Inicializa los atributos heredados de Spaceship y los específicos de la nave de combate.
     * @param name Nombre de la nave.
     * @param origin País de origen de la nave.
     * @param weight Peso de la nave en kilogramos.
     * @param height Altura de la nave en metros.
     * @param power Potencia de la nave en caballos de fuerza.
     * @param primaryWeapon Arma principal de la nave.
     * @param shieldActivation Estado de activación del escudo defensivo de la nave.
     */
    public Fighter(String name, String origin, float weight, float height, float power, String primaryWeapon, boolean shieldActivation){
        super(name, origin, weight, height, power);
        this.primaryWeapon = primaryWeapon;
        this.shieldActivation = shieldActivation;
    }

    /**
     * Desactiva el escudo defensivo de la nave de combate.
     */
    public void unprotect(){
        shieldActivation = false;
        System.out.println("¡Peligro! El escudo de defensa ha sido desactivado.");
    }

    /**
     * Implementación del método abstracto de la clase Spaceship.
     * Solicita al usuario el ingreso del arma principal de la nave.
     * @param scanner Objeto de la clase Scanner para leer la entrada del usuario.
     */
    @Override
    protected void specificDataRequest(Scanner scanner) {
        System.out.println("Ingrese el Arma Primaria de la nave de combate:");
        this.primaryWeapon = scanner.nextLine();
    }

    /**
     * Implementación del método abstracto de la clase Spaceship.
     * Muestra en consola el arma principal de la nave.
     */
    @Override
    public void specificDataDisplay() {
        System.out.println("Arma Primaria: " + this.primaryWeapon);
    }

    /**
     * Implementación del método abstracto de la clase Spaceship.
     * Muestra en consola un mensaje indicando que la nave ha despegado.
     */
    @Override
    public void takeOff() {
        System.out.println("La nave de combate ha despegado...");
    }

    /**
     * Implementación del método abstracto de la clase Spaceship.
     * Muestra en consola un mensaje indicando que la nave ha aterrizado.
     */
    @Override
    public void land(){
        System.out.println("La nave de combate ha aterrizado...");
    }

}