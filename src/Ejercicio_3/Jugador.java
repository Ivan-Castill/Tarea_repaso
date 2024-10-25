package Ejercicio_3;

class Jugador {
    // Atributos privados
    private String nombre;
    private int anioNacimiento;
    private int numeroCamiseta;

    // Constructor
    public Jugador(String nombre, int anioNacimiento, int numeroCamiseta) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.numeroCamiseta = numeroCamiseta;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    // Setter para el número de camiseta
    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    // Método para mostrar la información del jugador
    public void mostrarInfo() {
        System.out.println("===== Información del Jugador =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de Nacimiento: " + anioNacimiento);
        System.out.println("Número de Camiseta: " + numeroCamiseta);
    }

    // Método para calcular el total de la venta de camisetas
    public double calcularVenta(int cantidad) {
        return cantidad * 25.00;
    }
}