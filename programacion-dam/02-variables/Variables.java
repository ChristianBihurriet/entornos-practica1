public class Variables {

    public static void main(String[] args) {
        // Declarar es indicar el tipo y el nombre de una variable.
        int edad;

        // Inicializar es guardar su primer valor.
        edad = 20;
        System.out.println("Edad inicial: " + edad);

        // Reasignar es sustituir el valor anterior por uno nuevo.
        edad = 21;
        System.out.println("Edad después de reasignar: " + edad);

        // También podemos declarar e inicializar en una sola sentencia.
        int numeroDeAlumnos = 25;
        System.out.println("Número de alumnos: " + numeroDeAlumnos);

        // numeroDeAlumnos usa camelCase: la primera palabra va en minúscula
        // y las siguientes comienzan con mayúscula.
        // Un identificador no puede empezar por un número ni contener espacios.
        // int 2 alumnos = 25; // Descomenta y observa el error de compilación.
        // ¿Qué ocurre si cambias edad por un número diferente?
    }
}

