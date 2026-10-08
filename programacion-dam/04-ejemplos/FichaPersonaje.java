public class FichaPersonaje {

    public static void main(String[] args) {
        // Cada variable guarda un dato de nuestro personaje.
        String nombre = "Luna";
        int nivel = 4;
        int vida = 85;
        int ataque = 18;
        int defensa = 12;
        boolean estaVivo = true;

        System.out.println("=== FICHA DEL PERSONAJE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("¿Está vivo?: " + estaVivo);

        // Prueba a modificar el nombre del personaje y sus características.
        // ¿Qué valores tendrían sentido para un personaje de nivel 1?
    }
}

