public class Ejercicio03 {

    public static void main(String[] args) {
        double precioProducto1 = 2.50;
        double precioProducto2 = 3.00;
        double precioProducto3 = 4.50;
        // La suma utiliza las variables para que funcione aunque cambiemos sus valores.
        double precioFinal = precioProducto1 + precioProducto2 + precioProducto3;

        System.out.println("Producto 1: " + precioProducto1 + " euros");
        System.out.println("Producto 2: " + precioProducto2 + " euros");
        System.out.println("Producto 3: " + precioProducto3 + " euros");
        System.out.println("Precio final: " + precioFinal + " euros");
    }
}
