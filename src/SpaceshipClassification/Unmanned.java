package SpaceshipClassification;

import java.util.Scanner;

public class Unmanned extends Spaceship{
    private String type;
    private String payload;

    /**
     * Constructor de la clase Unmanned.
     * @param name El nombre de la nave.
     * @param origin El lugar de origen de la nave.
     * @param weight El peso de la nave en toneladas.
     * @param height La altura de la nave en metros.
     * @param power La potencia de la nave en caballos de fuerza.
     * @param type El tipo específico de la nave no tripulada.
     * @param payload La carga útil que transportará la nave.
     */
    public Unmanned(String name, String origin, float weight, float height, float power, String type, String payload){
        super(name, origin, weight, height, power);
        this.type = type;
        this.payload = payload;
    }

    /**
     * Método que realiza una maniobra evasiva.
     */
    public void evasiveManeuver(){
        System.out.println("El objeto peligroso ha sido evadido exitosamente...");
    }

    /**
     * Método que solicita datos específicos de la nave no tripulada al usuario.
     * @param scanner Scanner utilizado para recibir la entrada del usuario.
     */
    @Override
    protected void specificDataRequest(Scanner scanner) {
        System.out.println("Indique el tipo específico de Nave Espacial No tripulada: ");
        this.type = scanner.nextLine();
        System.out.println("Indique la carga útil que transportará la Nave: ");
        this.payload = scanner.nextLine();
    }

    /**
     * Método que muestra los datos específicos de la nave no tripulada.
     */
    @Override
    public void specificDataDisplay() {
        System.out.println("Tipo de Nave No Tripulada: " + this.type);
        System.out.println("Carga Útil: " + this.payload);
    }

    /**
     * Método que indica que la nave no tripulada ha despegado.
     */
    @Override
    public void takeOff() {
        System.out.println("La nave espacial no tripulada ha despegado...");
    }

    /**
     * Método que indica que la nave no tripulada ha aterrizado.
     */
    @Override
    public void land(){
        System.out.println("La nave espacial no tripulada ha aterrizado...");
    }

}
