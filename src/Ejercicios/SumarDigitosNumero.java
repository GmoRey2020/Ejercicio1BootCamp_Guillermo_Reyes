package Ejercicios;

public class SumarDigitosNumero {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 5678;
        // Convertir el número a una cadena
        String numeroStr = Integer.toString(a);
        // Inicializar la variable para almacenar la suma de los dígitos
        int suma = 0;
        // Iterar sobre cada carácter de la cadena
        for (char digito : numeroStr.toCharArray()) {
            // Convertir el carácter a un dígito entero y sumarlo
            suma += Character.getNumericValue(digito);
        }
        System.out.println("La suma de los dígitos del número " + a + " es: " + suma);
    }
}
