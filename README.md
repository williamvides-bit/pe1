# Práctica Evaluada 1 — Registro de Participantes

**Asignatura:** APE 115 — Aplicaciones de Escritorio
**Ciclo:** III / 2026

---

## Datos del estudiante

- **Nombre completo:**
- **Carnet:**

---

## Cómo ejecutar

```bash
mvn clean compile exec:java
```

## Estructura del proyecto

```
src/main/java/sv/edu/ues/ape115/
├── app/Main.java              # Punto de entrada (lanza la GUI en el EDT)
├── ui/RegistroFrame.java      # Ventana principal (BorderLayout)
├── model/Participante.java    # POJO del participante
└── util/Validador.java        # Validaciones estáticas (sin dependencias de Swing)
```

## Entregables

1. Todo el código fuente y el `pom.xml` en este repositorio.
2. Captura de pantalla de la aplicación corriendo en `docs/captura.png`.

Consulta el enunciado completo en el aula virtual y la rúbrica en `docs/RUBRICA.md`.
