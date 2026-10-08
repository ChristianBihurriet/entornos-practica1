public class Precedencia {

    public static void main(String[] args) {
        int sinParentesis = 2 + 3 * 4;   // * tiene mayor precedencia que +: 14.
        int conParentesis = (2 + 3) * 4; // Los paréntesis hacen primero la suma: 20.
        int otroEjemplo = 10 - 6 / 2;    // Primero 6 / 2 y después 10 - 3: 7.

        System.out.println("2 + 3 * 4 = " + sinParentesis);
        System.out.println("(2 + 3) * 4 = " + conParentesis);
        System.out.println("10 - 6 / 2 = " + otroEjemplo);

        // La precedencia decide qué operadores se agrupan primero.
        // Con la misma precedencia, +, -, * y / se asocian de izquierda a derecha.
        int asociatividad = 20 / 5 * 2; // (20 / 5) * 2 = 8.
        System.out.println("20 / 5 * 2 = " + asociatividad);

        // Precedencia no significa que todos los operandos se evalúen en otro orden:
        // describe cómo se agrupa la expresión. Usa paréntesis para expresar tu intención.
        // ¿Qué resultado esperas si añades paréntesis a 10 - 6 / 2?
    }
}
