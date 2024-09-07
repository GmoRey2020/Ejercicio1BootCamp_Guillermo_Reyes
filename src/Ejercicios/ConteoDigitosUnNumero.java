package Ejercicios;

public class ConteoDigitosUnNumero {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 987654;

        // Convertir el número a una cadena
        String numeroStr = Integer.toString(a);

        // Contar la cantidad de dígitos
        int cantidadDigitos = numeroStr.length();

        // Mostrar el resultado
        System.out.println("El número " + a + " tiene " + cantidadDigitos + " dígitos.");
    }
}
