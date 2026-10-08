public class TiposPrimitivos {

    public static void main(String[] args) {
        // Los tipos enteros almacenan números sin parte decimal.
        byte numeroPequeno = 100;
        short numeroMediano = 30_000;
        int habitantes = 1_000_000;
        long distanciaMuyGrande = 9_000_000_000L; // L indica un literal long.

        // float y double almacenan aproximaciones de números decimales.
        float temperatura = 21.5F; // F indica un literal float.
        double precio = 19.99;

        // char guarda una unidad de código UTF-16 entre comillas simples.
        char inicial = 'A';

        // boolean solo puede contener true (verdadero) o false (falso).
        // Java no define un tamaño fijo de almacenamiento para boolean.
        boolean claseTerminada = false;

        System.out.println("byte: " + numeroPequeno);
        System.out.println("short: " + numeroMediano);
        System.out.println("int: " + habitantes);
        System.out.println("long: " + distanciaMuyGrande);
        System.out.println("float: " + temperatura);
        System.out.println("double: " + precio);
        System.out.println("char: " + inicial);
        System.out.println("boolean: " + claseTerminada);

        // ¿Qué ocurre si intentas guardar 200 en numeroPequeno?
        // byte valorIncorrecto = 200; // Descomenta y lee el error.
    }
}

