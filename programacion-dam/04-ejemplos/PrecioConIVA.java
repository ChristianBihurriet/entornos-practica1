public class PrecioConIVA {

    public static void main(String[] args) {
        double precioBase = 50.0;
        double porcentajeIVA = 21.0;

        // Dividimos el porcentaje entre 100 para convertir 21 en 0.21.
        double importeIVA = precioBase * porcentajeIVA / 100;
        double precioFinal = precioBase + importeIVA;

        System.out.println("Precio base: " + precioBase + " euros");
        System.out.println("IVA: " + porcentajeIVA + " %");
        System.out.println("Importe del IVA: " + importeIVA + " euros");
        System.out.println("Precio final: " + precioFinal + " euros");

        // ¿Qué resultado esperas si el precio base cambia a 100 euros?
        // Prueba también con otro porcentaje de IVA.
    }
}

