public class IncrementoDecremento {

    public static void main(String[] args) {
        int vidas = 3;
        System.out.println("Vidas iniciales: " + vidas);

        vidas++; // Incrementa en una unidad.
        System.out.println("Después de vidas++: " + vidas);
        vidas--; // Decrementa en una unidad.
        System.out.println("Después de vidas--: " + vidas);

        int numero = 5;
        int resultadoPosterior = numero++; // Primero copia 5 y después incrementa numero.
        System.out.println("numero++ entrega: " + resultadoPosterior);
        System.out.println("numero queda en: " + numero);

        numero = 5;
        int resultadoAnterior = ++numero; // Primero incrementa numero y después copia 6.
        System.out.println("++numero entrega: " + resultadoAnterior);
        System.out.println("numero queda en: " + numero);

        // Fuera de una expresión, numero++ y ++numero incrementan por igual.
    }
}

