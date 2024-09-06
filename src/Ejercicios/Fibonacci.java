package Ejercicios;

public class Fibonacci {
    public static void main(String[] args) {
        // Número de términos en la secuencia de Fibonacci
        int N = 10;

        // Inicializar los primeros dos términos de la secuencia
        int a = 0;
        int b = 1;

        // Imprimir los primeros N números de la secuencia de Fibonacci
        System.out.print("Los primeros " + N + " números de la secuencia de Fibonacci son: ");

        // Imprimir el primer número
        System.out.print(a + " ");

        // Imprimir el segundo número
        if (N > 1) {
            System.out.print(b + " ");
        }

        // Calcular e imprimir el resto de la secuencia
        for (int i = 2; i < N; i++) {
            int siguiente = a + b; // El siguiente número es la suma de los dos anteriores
            System.out.print(siguiente + " ");
            a = b; // Desplazar a b a a
            b = siguiente; // Desplazar siguiente a b
        }

        System.out.println(); // Nueva línea después de imprimir la secuencia
    }
}
