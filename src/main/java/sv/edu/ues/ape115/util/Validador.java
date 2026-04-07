package sv.edu.ues.ape115.util;

/**
 * Utilidades de validacion. Todos los metodos son estaticos y devuelven:
 *   - null  si el valor es valido
 *   - String con el mensaje de error en caso contrario
 *
 * Esta clase NO debe importar nada de javax.swing: es independiente de la vista.
 */
public class Validador {

    // TODO: definir patrones regex como constantes.
    // Sugerencias:
    //   NOMBRE -> solo letras (incluyendo acentos y enie) y espacios, min 2 chars
    //   CARNET -> dos letras seguidas de seis digitos (AA######)
    //   EMAIL  -> patron simple usuario@dominio.tld

    public static String validarNombre(String valor, String campo) {
        // TODO
        return null;
    }

    public static String validarCarnet(String valor) {
        // TODO
        return null;
    }

    public static String validarEmail(String valor) {
        // TODO
        return null;
    }

    public static String validarEdad(String valor) {
        // TODO: parsear a int dentro de try/catch, validar rango 16..99
        return null;
    }
}
