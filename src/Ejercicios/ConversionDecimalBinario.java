package Ejercicios;

public class ConversionDecimalBinario {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 45;

        // Convertir el número decimal a binario
        String binario = Integer.toBinaryString(a);

        // Mostrar el resultado
        System.out.println("El número decimal " + a + " en binario es: " + binario);
    }
}
