package Ejercicios;

public class InversionNumeroN {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 54321;

        // Convertir el número a una cadena
        String numeroStr = Integer.toString(a);

        // Invertir la cadena
        String numeroInvertidoStr = new StringBuilder(numeroStr).reverse().toString();

        // Convertir la cadena invertida de nuevo a un número entero
        int numeroInvertido = Integer.parseInt(numeroInvertidoStr);
        System.out.println("El número invertido es: " + numeroInvertido);
    }
}
