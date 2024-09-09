package Ejercicios;

public class Divisibilidad {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 45;
        // Verificar divisibilidad por 2
        boolean divisiblePor2 = (a % 2 == 0);
        // Verificar divisibilidad por 3
        boolean divisiblePor3 = (a % 3 == 0);
        // Verificar divisibilidad por 5
        boolean divisiblePor5 = (a % 5 == 0);

        System.out.println(a + " es divisible por 2: " + divisiblePor2);
        System.out.println(a + " es divisible por 3: " + divisiblePor3);
        System.out.println(a + " es divisible por 5: " + divisiblePor5);
    }
}
