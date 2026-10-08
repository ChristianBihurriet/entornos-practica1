public class CadenasTexto {

    public static void main(String[] args) {
        // String representa texto. No es un tipo primitivo: es un tipo de referencia.
        // Una variable de referencia permite acceder a un objeto, como este texto.
        String nombre = "Lucía";
        String modulo = "Programación";
        int curso = 1; // int sí es un tipo primitivo: guarda directamente un valor entero.

        // El operador + concatena, es decir, une textos y valores.
        String presentacion = nombre + " estudia " + modulo + " en " + curso + ".º DAM.";

        // print no cambia de línea al terminar.
        System.out.print("Presentación: ");
        // println sí cambia de línea al terminar.
        System.out.println(presentacion);
        System.out.println("¡Mucho ánimo, " + nombre + "!");

        // Prueba a modificar el nombre. ¿Qué partes de la salida cambiarán?
    }
}

