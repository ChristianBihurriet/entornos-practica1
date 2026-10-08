public class VidaPersonaje {

    public static void main(String[] args) {
        int vida = 100;
        int danioRecibido = 25;
        int curacion = 10;

        System.out.println("Vida inicial: " + vida);

        vida -= danioRecibido; // Equivale a vida = vida - danioRecibido.
        System.out.println("Después de recibir " + danioRecibido + " de daño: " + vida);

        vida += curacion; // Equivale a vida = vida + curacion.
        System.out.println("Después de recuperar " + curacion + " de vida: " + vida);

        System.out.println("Vida restante: " + vida);
        // ¿Qué ocurre si aumentas el daño? Intenta predecirlo antes de ejecutar.
    }
}

