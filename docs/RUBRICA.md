# Rúbrica de evaluación — Práctica Evaluada 1

**Asignatura:** APE 115 — Aplicaciones de Escritorio
**Unidades evaluadas:** Unidad 1 y Unidad 2 (semanas 1–4)
**Ponderación:** 15% de la nota global
**Total de puntos:** 100

La calificación se asigna sumando los puntos obtenidos en cada criterio. Si el proyecto **no compila**, la nota máxima posible es 30/100.

---

## A. Estructura del proyecto y compilación (15 pts)

| Criterio | Pts | Descripción |
|---|---|---|
| El proyecto compila sin errores con `mvn clean compile` | 6 | Si no compila, se aplica el techo de 30/100. |
| Estructura de paquetes correcta (`app`, `ui`, `model`, `util`) | 4 | Cada clase está en el paquete que le corresponde. |
| Clase `Main` minimalista que solo lanza la GUI en el EDT | 3 | Uso correcto. |
| `pom.xml` válido y `README.md` con datos del estudiante | 2 | Nombre y carnet visibles. |

## B. Construcción de la interfaz (35 pts)

| Criterio | Pts | Descripción |
|---|---|---|
| Uso correcto de `BorderLayout` con las zonas NORTH / CENTER / EAST / SOUTH | 5 | Cada zona contiene lo pedido. |
| Cabecera (NORTH) con `JLabel` y formato distintivo | 3 | Fuente más grande, color o borde. |
| Formulario (CENTER) con `GridBagLayout` o `GridLayout` justificado | 6 | Alineación clara y consistente entre etiquetas y campos. |
| Los 5 campos del formulario están presentes con sus `JLabel` | 5 | Nombres, Apellidos, Carnet, Email, Edad. |
| Cada campo tiene `setToolTipText` explicativo | 3 | Los 5 con tooltip claro. |
| Tres botones (Registrar / Limpiar / Salir) presentes con mnemonics `Alt+R`, `Alt+L`, `Alt+S` | 4 | Mnemonics asignados correctamente. |
| Cada botón tiene tooltip y color de fondo distinto que refuerza su semántica | 3 | Verde / amarillo-naranja / rojo. |
| Etiqueta de estado debajo del formulario que cambia de color (rojo en error) | 3 | Feedback visual al usuario. |
| Área de resultados (EAST): `JTextArea` no editable dentro de `JScrollPane` | 2 | Scroll funcional. |
| Ventana centrada en pantalla con tamaño preferido razonable (~900×600) | 1 | `setLocationRelativeTo(null)`. |

## C. Validación de datos (30 pts)

| Criterio | Pts | Descripción |
|---|---|---|
| Clase `Validador` separada de la vista, con métodos estáticos | 5 | No mezclada con `RegistroFrame`; sin imports de `javax.swing`. |
| Cada método de validación devuelve `null` si es válido o `String` con el error | 3 | Contrato consistente. |
| Validación de **Nombres**: obligatorio, solo letras y espacios, mínimo 2 caracteres | 4 | Acepta acentos y la ñ. |
| Validación de **Apellidos**: obligatorio, solo letras y espacios, mínimo 2 caracteres | 4 | Mismas reglas que Nombres. |
| Validación de **Carnet**: `JFormattedTextField` con máscara y patrón `AA######` | 5 | Dos letras + seis dígitos, máscara aplicada. |
| Validación de **Email**: presencia de `@` y dominio válido | 5 | Patrón razonable (regex). |
| Validación de **Edad**: entero entre 16 y 99, manejo de `NumberFormatException` | 4 | No rompe ante texto no numérico. |

## D. Comportamiento de los botones (5 pts)

| Criterio | Pts | Descripción |
|---|---|---|
| **Registrar**: valida, muestra estado y agrega al área de resultados con el formato `[#001] Apellidos, Nombres — carnet — email — edad años` | 2 | Numeración incremental. |
| **Limpiar**: borra todos los campos del formulario y devuelve foco a Nombres (sin tocar el área de resultados) | 1 | `requestFocus()`. |
| **Salir**: confirma con `JOptionPane.showConfirmDialog` antes de cerrar | 1 | Cancelar funciona. |
| Los listeners NO usan la clase principal como `implements ActionListener` global (lambdas o clases anónimas) | 1 | Buen uso del modelo de delegación. |

## E. Calidad del código (5 pts)

| Criterio | Pts | Descripción |
|---|---|---|
| Nombres de variables y métodos significativos y consistentes | 2 | No `jt1`, `b2`. |
| Separación de responsabilidades (vista / modelo / utilidades) | 2 | `RegistroFrame` no contiene reglas de validación. |
| Sin warnings importantes del compilador, sin código muerto | 1 | Limpieza general. |

## F. Modelo y entregables (10 pts)

| Criterio | Pts | Descripción |
|---|---|---|
| Clase `Participante` como POJO con constructor, getters/setters | 3 | En el paquete `model`. |
| Método `toString()` devuelve el formato pedido | 2 | `[#001] Apellidos, Nombres — ...` |
| Repositorio de GitHub Classroom con todo el código y `pom.xml` | 3 | |
| Captura de pantalla en `docs/captura.png` con la aplicación corriendo | 2 | |

---

## Penalizaciones

- **−10 pts** por usar generadores GUI tipo NetBeans Matisse (todo el código debe escribirse a mano).
- **−5 pts** por usar componentes de unidades futuras (`JCheckBox`, `JRadioButton`, `JComboBox`, `JList`, `JTable`, `JTree`) intentando "compensar" la falta de validaciones.
- **Anulación completa** si se detecta plagio o uso de IA generativa.

---

## Escala final

| Puntos | Nota |
|---|---|
| 90–100 | 10.0 |
| 80–89  | 9.0 |
| 70–79  | 8.0 |
| 60–69  | 7.0 |
| 50–59  | 6.0 |
| < 50   | Reprobada |
