package Ejercicios;

public class CalcularMaximoCD {
    public static void main(String[] args) {
        // Declaración e inicialización de las variables
        int a = 48;
        int b = 18;

        // Calcular el MCD usando el algoritmo de Euclides
        int mcd = calcularMCD(a, b);

        // Mostrar el resultado
        System.out.println("El MCD de " + a + " y " + b + " es: " + mcd);
    }

    // Método para calcular el MCD usando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        // Aplicar el algoritmo de Euclides
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
