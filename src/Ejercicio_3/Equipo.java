package Ejercicio_3;

class Equipo {
    // Atributo para almacenar el nombre del equipo
    private String nombreEquipo;
    private Jugador jugador;

    // Constructor
    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    // Método para inscribir un jugador
    public void inscribirJugador(String nombre, int anioNacimiento, int numeroCamiseta) {
        jugador = new Jugador(nombre, anioNacimiento, numeroCamiseta);
    }

    // Método para mostrar la información del jugador inscrito
    public void mostrarJugador() {
        if (jugador != null) {
            jugador.mostrarInfo();
        } else {
            System.out.println("No hay jugadores inscritos en el equipo.");
        }
    }

    // Método para obtener el jugador inscrito
    public Jugador obtenerJugador() {
        return jugador;
    }
}

