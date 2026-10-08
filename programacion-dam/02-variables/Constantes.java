public class Constantes {

    public static void main(String[] args) {
        // final indica que una variable no puede recibir otro valor después.
        // Por convención, las constantes se nombran con MAYÚSCULAS_Y_GUIONES_BAJOS.
        final double PI = 3.14159;
        final int VIDA_MAXIMA = 100;

        double radio = 3.0;
        double longitud = 2 * PI * radio;

        System.out.println("Valor de PI: " + PI);
        System.out.println("Vida máxima: " + VIDA_MAXIMA);
        System.out.println("Longitud de la circunferencia: " + longitud);

        // PI = 3.14; // Descomenta: Java avisará de que PI ya tiene un valor.
        // VIDA_MAXIMA = 120; // Una constante tampoco se puede reasignar.
        // ¿Cuándo resulta útil impedir que un valor cambie por accidente?
    }
}

