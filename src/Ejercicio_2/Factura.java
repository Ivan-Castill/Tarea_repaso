package Ejercicio_2;

class Factura {
    // Atributos
    private String nombrePlato;
    private double precioPlato;
    private int cantidad;

    // Constructor
    public Factura(String nombrePlato, double precioPlato, int cantidad) {
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
        this.cantidad = cantidad;
    }

    // Método para calcular el total
    public double calcularTotal() {
        return precioPlato * cantidad;
    }

    // Método para mostrar la factura
    public void mostrarFactura() {
        System.out.println("===== Factura =====");
        System.out.println("Plato: " + nombrePlato);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio por plato: $" + precioPlato);
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}