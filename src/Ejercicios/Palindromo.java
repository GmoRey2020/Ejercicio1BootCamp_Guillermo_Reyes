package Ejercicios;

public class Palindromo {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 1223;
        // Convertir el número a una cadena
        String numeroStr = Integer.toString(a);
        // Invertir la cadena
        String numeroInvertidoStr = new StringBuilder(numeroStr).reverse().toString();
        // Verificar si la cadena original es igual a la cadena invertida
        if (numeroStr.equals(numeroInvertidoStr)) {
            System.out.println(a + " es un número palíndromo.");
        } else {
            System.out.println(a + " no es un número palíndromo.");
        }
    }
}
