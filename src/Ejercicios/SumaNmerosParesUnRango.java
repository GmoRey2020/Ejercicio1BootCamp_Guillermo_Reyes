package Ejercicios;

public class SumaNmerosParesUnRango {
    public static void main(String[] args) {
        // Declaración e inicialización de las variables
        int a = 1;
        int b = 100;
        // Inicializar la variable para almacenar la suma de los números pares
        int suma = 0;

        // Recorrer todos los números en el rango [a, b]
        for (int i = a; i <= b; i++) {
            // Verificar si el número es par
            if (i % 2 == 0) {
                suma += i; // Sumar el número par
            }
        }
        System.out.println("La suma de los números pares entre " + a + " y " + b + " es: " + suma);
    }
}
