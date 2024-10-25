package Ejercicio_1;

public class Personaje {
    // Atributos privados
    private String nombre;
    private int añoNacimiento;
    private String telefono;

    // Constructor
    public Personaje(String nombre, int añoNacimiento, String telefono) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setter para modificar el teléfono
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

