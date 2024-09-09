package Ejercicios;

public class FactorialUnNumero {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 6;

        // Calcular el factorial
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i; // Multiplica el valor actual de factorial por i
        }
        System.out.println("El factorial de " + a + " es: " + factorial);
    }
}
