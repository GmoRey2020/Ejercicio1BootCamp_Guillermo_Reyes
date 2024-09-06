package Ejercicios;

public class NumeroPerfecto {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 28;

        // Inicializar la variable para almacenar la suma de los divisores propios
        int sumaDivisores = 0;

        // Encontrar y sumar los divisores propios del número
        for (int i = 1; i < a; i++) {
            if (a % i == 0) { // Si i es un divisor de a
                sumaDivisores += i;
            }
        }
        // Verificar si la suma de los divisores propios es igual al número
        if (sumaDivisores == a) {
            System.out.println(a + " es un número perfecto.");
        } else {
            System.out.println(a + " no es un número perfecto.");
        }
    }
}
