public class Ejercicio02 {

    public static void main(String[] args) {
        double base = 5.0;
        double altura = 3.0;
        // El área mide la superficie; el perímetro suma los cuatro lados.
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
