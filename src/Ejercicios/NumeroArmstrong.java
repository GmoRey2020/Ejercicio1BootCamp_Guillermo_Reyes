package Ejercicios;

public class NumeroArmstrong {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 153;

        // Convertir el número a una cadena para facilitar el manejo de dígitos
        String numeroStr = Integer.toString(a);

        // Obtener la cantidad de dígitos
        int cantidadDigitos = numeroStr.length();

        // Inicializar la variable para almacenar la suma de los dígitos elevados
        int suma = 0;

        // Calcular la suma de los dígitos elevados a la potencia de la cantidad de dígitos
        for (char digito : numeroStr.toCharArray()) {
            int valorDigito = Character.getNumericValue(digito);
            suma += Math.pow(valorDigito, cantidadDigitos);
        }

        // Verificar si la suma es igual al número original
        if (suma == a) {
            System.out.println(a + " es un número Armstrong.");
        } else {
            System.out.println(a + " no es un número Armstrong.");
        }
    }
}
