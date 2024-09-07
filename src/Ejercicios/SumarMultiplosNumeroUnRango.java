package Ejercicios;

public class SumarMultiplosNumeroUnRango {
    public static void main(String[] args) {
        // Declaración e inicialización de las variables
        int a = 3;
        int rangoInicio = 1;
        int rangoFin = 50;

        // Inicializar la variable para almacenar la suma de los múltiplos
        int suma = 0;

        // Recorrer todos los números en el rango [rangoInicio, rangoFin]
        for (int i = rangoInicio; i <= rangoFin; i++) {
            // Verificar si el número es múltiplo de 'a'
            if (i % a == 0) {
                suma += i; // Sumar el múltiplo
            }
        }
        System.out.println("La suma de los múltiplos de " + a + " en el rango de " + rangoInicio + " a " + rangoFin + " es: " + suma);
    }
}
