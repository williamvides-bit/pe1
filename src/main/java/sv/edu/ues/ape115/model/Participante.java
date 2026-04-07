package sv.edu.ues.ape115.model;

/**
 * POJO que representa a un participante del congreso.
 *
 * Debe contener los atributos del formulario, su constructor completo,
 * getters/setters y un toString() que devuelva el formato:
 *
 *   [#001] Apellidos, Nombres - carnet - email - edad anios
 */
public class Participante {

    private int numero;
    private String nombres;
    private String apellidos;
    private String carnet;
    private String email;
    private int edad;

    public Participante(int numero, String nombres, String apellidos,
                        String carnet, String email, int edad) {
        // TODO: inicializar atributos
    }

    // TODO: getters y setters

    @Override
    public String toString() {
        // TODO: devolver el formato pedido en el enunciado.
        return "";
    }
}
