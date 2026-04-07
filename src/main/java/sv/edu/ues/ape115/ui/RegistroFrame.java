package sv.edu.ues.ape115.ui;

import javax.swing.*;
import java.awt.*;

import sv.edu.ues.ape115.model.Participante;
import sv.edu.ues.ape115.util.Validador;

/**
 * Ventana principal del formulario de registro de participantes.
 *
 * Estructura sugerida (BorderLayout):
 *   NORTH  -> panel de cabecera con titulo
 *   CENTER -> panel de formulario (GridBagLayout) con los 5 campos
 *   EAST   -> area de resultados (JTextArea no editable + JScrollPane)
 *   SOUTH  -> etiqueta de estado + panel de botones (FlowLayout)
 */
public class RegistroFrame extends JFrame {

    // ====== Componentes del formulario ======
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JFormattedTextField txtCarnet;
    private JTextField txtEmail;
    private JTextField txtEdad;

    // ====== Botones ======
    private JButton btnRegistrar;
    private JButton btnLimpiar;
    private JButton btnSalir;

    // ====== Estado y resultados ======
    private JLabel lblEstado;
    private JTextArea areaResultados;
    private int contadorRegistros = 0;

    public RegistroFrame() {
        super("Registro de Participantes - Congreso APE 115");
        inicializarVentana();
        construirInterfaz();
        registrarEventos();
    }

    private void inicializarVentana() {
        // TODO: setSize(900, 600), setDefaultCloseOperation(EXIT_ON_CLOSE),
        //       setLocationRelativeTo(null)
    }

    private void construirInterfaz() {
        setLayout(new BorderLayout(10, 10));
        add(crearCabecera(),    BorderLayout.NORTH);
        add(crearFormulario(),  BorderLayout.CENTER);
        add(crearResultados(),  BorderLayout.EAST);
        add(crearPiePagina(),   BorderLayout.SOUTH);
    }

    private JPanel crearCabecera() {
        // TODO: JPanel con un JLabel con titulo grande/negrita.
        return new JPanel();
    }

    private JPanel crearFormulario() {
        // TODO: JPanel con GridBagLayout que contenga las 5 parejas
        //       JLabel + componente. Recuerda asignar setToolTipText a cada campo.
        //
        //   Nombres   -> JTextField
        //   Apellidos -> JTextField
        //   Carnet    -> JFormattedTextField con mascara AA######
        //   Email     -> JTextField
        //   Edad      -> JTextField
        return new JPanel();
    }

    private JScrollPane crearResultados() {
        // TODO: JTextArea no editable dentro de un JScrollPane.
        return new JScrollPane();
    }

    private JPanel crearPiePagina() {
        // TODO: panel con la etiqueta de estado arriba y los tres botones abajo.
        //   btnRegistrar -> Alt+R, fondo verde
        //   btnLimpiar   -> Alt+L, fondo amarillo/naranja
        //   btnSalir     -> Alt+S, fondo rojo
        return new JPanel();
    }

    private void registrarEventos() {
        // TODO: asignar ActionListener (lambdas) a los tres botones.
    }

    private void registrarParticipante() {
        // TODO: 1. Llamar a los metodos de Validador para cada campo.
        //       2. Si hay error, mostrarlo en lblEstado en color rojo.
        //       3. Si todo es valido, crear un Participante, agregarlo al area
        //          de resultados con el formato pedido y limpiar el formulario.
    }

    private void limpiarFormulario() {
        // TODO: borrar campos y devolver foco a Nombres.
    }

    private void confirmarSalida() {
        // TODO: JOptionPane.showConfirmDialog antes de cerrar.
    }
}
