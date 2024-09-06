package Ejercicios;

public class CalcularPotencia {
    public static void main(String[] args) {
        // Declaración e inicialización de las variables
        int base = 2;
        int exponente = 8;

        // Calcular la potencia
        double resultado = Math.pow(base, exponente);
        System.out.println(base + " elevado a la potencia de " + exponente + " es: " + resultado);
    }
}
