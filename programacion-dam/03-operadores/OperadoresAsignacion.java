public class OperadoresAsignacion {

    public static void main(String[] args) {
        int puntuacion = 20; // = asigna un valor.
        System.out.println("Valor inicial: " + puntuacion);

        puntuacion += 5; // Equivale a: puntuacion = puntuacion + 5;
        System.out.println("Después de += 5: " + puntuacion);
        puntuacion -= 3;
        System.out.println("Después de -= 3: " + puntuacion);
        puntuacion *= 2;
        System.out.println("Después de *= 2: " + puntuacion);
        puntuacion /= 4; // Como es int, la división es entera.
        System.out.println("Después de /= 4: " + puntuacion);
        puntuacion %= 5;
        System.out.println("Después de %= 5: " + puntuacion);

        // Intenta predecir cada valor antes de ejecutar el programa.
    }
}

