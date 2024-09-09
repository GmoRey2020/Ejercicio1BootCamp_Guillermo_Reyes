package Ejercicios;

public class NumerosPrimos {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 29;
        // Llamada al método que verifica si el número es primo
        if (esPrimo(a)) {
            System.out.println(a + " es un número primo.");
        } else {
            System.out.println(a + " no es un número primo.");
        }
    }
    // Método para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        // Casos especiales
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        if (numero == 2) {
            return true; // 2 es el único número primo par
        }
        if (numero % 2 == 0) {
            return false; // Todos los números pares mayores que 2 no son primos
        }
        // Verificación de factores hasta la raíz cuadrada del número
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false; // El número tiene un divisor distinto de 1 y él mismo
            }
        }
        // Si no se encontró ningún divisor, el número es primo
        return true;
    }
}
