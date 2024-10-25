package Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        // Crear objeto de la clase Personaje
        Personaje personaje = new Personaje("Aragorn", 1982, "123-456-789");

        // Mostrar valores iniciales usando getters
        System.out.println("Nombre: " + personaje.getNombre());
        System.out.println("Año de Nacimiento: " + personaje.getAñoNacimiento());
        System.out.println("Teléfono: " + personaje.getTelefono());

        // Cambiar el teléfono usando el setter y mostrar el valor actualizado
        personaje.setTelefono("987-654-321");
        System.out.println("Teléfono actualizado: " + personaje.getTelefono());
    }
}
