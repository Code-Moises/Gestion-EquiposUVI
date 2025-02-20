# Proyecto: Gestión de Equipos UVI

## Descripción
Este proyecto en Java gestiona la asignación de equipos UVI (Unidad de Vigilancia Intensiva) compuestos por un conductor, un médico y un enfermero. Los equipos se generan aleatoriamente y se asignan a turnos específicos con matrículas de ambulancia. Además, permite tratar a pacientes y registrar su diagnóstico y tratamiento.

## Características principales
- Gestión de conductores, médicos y enfermeros.
- Creación de equipos UVI aleatorios.
- Asignación de turnos y matrículas.
- Tratamiento de pacientes.
- Validación de datos de entrada.

## Estructura del Proyecto

### Clases principales:
- `App.java`: Contiene el método `main` y gestiona la asignación de equipos UVI.
- `Persona.java`: Clase abstracta base para `Conductor`, `Medico`, `Enfermero` y `Paciente`.
- `Conductor.java`: Representa un conductor con experiencia y licencia.
- `Medico.java`: Representa un médico con especialidad y número de colegiado.
- `Enfermero.java`: Representa un enfermero con especialización y conocimiento de idiomas.
- `Paciente.java`: Almacena información sobre diagnóstico y tratamiento de un paciente.
- `EquipoUvi.java`: Agrupa a un conductor, un médico y un enfermero en un equipo de emergencia.

## Instalación y ejecución
1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu_usuario/tu_repositorio.git
   ```
2. Compila el proyecto:
   ```bash
   javac *.java
   ```
3. Ejecuta el programa:
   ```bash
   java App
   ```

## Ejemplo de salida
```text
Equipo UVI:
Conductor: Julia Ron
Médico: Nuria Ros
Enfermero: Triana Garcia
Matrícula: JFX - 2345
Fecha: 2023-10-10
Turno: Mañana
-----------------------------
Paciente tratado: Manolo
Diagnóstico: No se, en verdad solo le dolía la cabeza
Tratamiento: Reposar un ratillo
```

## Autor
- Moisés Becerra

## Licencia
Este proyecto se distribuye bajo la licencia MIT.

