package Ejercicios;

public class IntercambioValores {
    public static void main(String[] args) {
        // Declaración e inicialización de las variables
        int a = 5;
        int b = 10;

        // Mostrar los valores antes del intercambio
        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Intercambiar los valores sin usar una tercera variable
        a = a + b; // a ahora es 15 (5 + 10)
        b = a - b; // b ahora es 5 (15 - 10)
        a = a - b; // a ahora es 10 (15 - 5)

        // Mostrar los valores después del intercambio
        System.out.println("Después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
