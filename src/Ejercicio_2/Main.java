package Ejercicio_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los datos del plato
        System.out.print("Ingrese el nombre del plato: ");
        String nombrePlato = scanner.nextLine();

        System.out.print("Ingrese el precio del plato: ");
        double precioPlato = scanner.nextDouble();

        System.out.print("Ingrese la cantidad deseada: ");
        int cantidad = scanner.nextInt();

        // Crear una instancia de Plato y Factura
        Plato plato = new Plato(nombrePlato, precioPlato);
        Factura factura = new Factura(plato.getNombre(), plato.getPrecio(), cantidad);

        // Mostrar la factura
        factura.mostrarFactura();

        scanner.close();
    }
}