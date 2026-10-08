public class DivisionEntera {

    public static void main(String[] args) {
        // Dos operandos enteros producen una división entera: se descarta el decimal.
        int divisionEntera = 10 / 3;

        // Si al menos un operando es decimal, el resultado también lo es.
        double divisionDecimalA = 10.0 / 3;
        double divisionDecimalB = 10 / 3.0;

        System.out.println("10 / 3 = " + divisionEntera);
        System.out.println("10.0 / 3 = " + divisionDecimalA);
        System.out.println("10 / 3.0 = " + divisionDecimalB);

        // % devuelve el resto: 10 = 3 * 3 + 1.
        int resto = 10 % 3;
        System.out.println("10 % 3 = " + resto);

        // ¿Por qué la primera división no devuelve decimales?
        // ¿Qué resultado esperas antes de cambiar 10 por 11?
    }
}

