public class Ejercicio04 {

    public static void main(String[] args) {
        int vida = 100;
        int danio = 30;
        int curacion = 12;

        System.out.println("Vida inicial: " + vida);
        // -= resta el daño y guarda inmediatamente la nueva vida.
        vida -= danio;
        System.out.println("Después del daño: " + vida);
        // += suma la curación sobre el valor que quedó tras el daño.
        vida += curacion;
        System.out.println("Después de la curación: " + vida);
    }
}
