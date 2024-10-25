package Ejercicio_3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancia del equipo
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        Equipo equipo = new Equipo(nombreEquipo);

        // Inscribir un jugador
        System.out.print("Ingrese el nombre del jugador: ");
        String nombreJugador = scanner.nextLine();
        System.out.print("Ingrese el año de nacimiento del jugador: ");
        int anioNacimiento = scanner.nextInt();
        System.out.print("Ingrese el número de camiseta del jugador: ");
        int numeroCamiseta = scanner.nextInt();

        equipo.inscribirJugador(nombreJugador, anioNacimiento, numeroCamiseta);

        // Mostrar la información del jugador inscrito
        equipo.mostrarJugador();

        // Modificar el número de camiseta del jugador
        System.out.print("¿Desea cambiar el número de camiseta? (si/no): ");
        scanner.nextLine(); // Limpiar el buffer
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el nuevo número de camiseta: ");
            int nuevoNumeroCamiseta = scanner.nextInt();
            equipo.obtenerJugador().setNumeroCamiseta(nuevoNumeroCamiseta);
            System.out.println("Número de camiseta actualizado.");
        }

        // Mostrar la información actualizada del jugador
        equipo.mostrarJugador();

        // Venta de camisetas
        System.out.print("Ingrese la cantidad de camisetas a vender: ");
        int cantidadCamisetas = scanner.nextInt();
        double totalVenta = equipo.obtenerJugador().calcularVenta(cantidadCamisetas);
        System.out.println("Total de la venta de camisetas: $" + totalVenta);

        scanner.close();
    }
}
