package Ejercicios;
public class NumeroParImpar {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 15;
        // Determinar si el número es par o impar
        if (a % 2 == 0) {
            // Si el residuo de a dividido por 2 es 0, entonces es par
            System.out.println(a + " es un número par.");
        } else {
            // Si el residuo de a dividido por 2 no es 0, entonces es impar
            System.out.println(a + " es un número impar.");
        }
    }
}