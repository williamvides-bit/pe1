package sv.edu.ues.ape115.app;

import javax.swing.SwingUtilities;

import sv.edu.ues.ape115.ui.RegistroFrame;

/**
 * Punto de entrada de la aplicacion.
 *
 * Responsabilidades:
 *  1. Lanzar la ventana principal dentro del Event Dispatch Thread.
 *
 * NO debe contener logica de negocio ni construir componentes graficos directamente.
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // TODO: Crear una instancia de RegistroFrame y hacerla visible.
        });
    }
}
