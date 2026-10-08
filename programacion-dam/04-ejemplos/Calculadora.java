public class Calculadora {

    public static void main(String[] args) {
        // Usamos int para observar también el comportamiento de la división entera.
        int primerNumero = 17;
        int segundoNumero = 5;

        System.out.println("Primer número: " + primerNumero);
        System.out.println("Segundo número: " + segundoNumero);
        System.out.println("Suma: " + (primerNumero + segundoNumero));
        System.out.println("Resta: " + (primerNumero - segundoNumero));
        System.out.println("Multiplicación: " + (primerNumero * segundoNumero));
        System.out.println("División entera: " + (primerNumero / segundoNumero));
        System.out.println("Resto: " + (primerNumero % segundoNumero));

        // Cambia los números e intenta predecir todos los resultados.
        // int error = primerNumero / 0; // Descomenta, compila y observa qué sucede al ejecutar.
    }
}

