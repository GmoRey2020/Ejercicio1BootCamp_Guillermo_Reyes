package Ejercicios;

public class VerificarNumeroCuadradoPerfecto {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 64;

        // Verificar si 'a' es un cuadrado perfecto
        boolean esCuadradoPerfecto = esCuadradoPerfecto(a);

        // Mostrar el resultado
        if (esCuadradoPerfecto) {
            System.out.println(a + " es un cuadrado perfecto.");
        } else {
            System.out.println(a + " no es un cuadrado perfecto.");
        }
    }
    // Método para verificar si un número es un cuadrado perfecto
    public static boolean esCuadradoPerfecto(int num) {
        if (num < 0) {
            return false; // Los números negativos no son cuadrados perfectos
        }

        // Calcular la raíz cuadrada del número
        int raiz = (int) Math.sqrt(num);

        // Verificar si el cuadrado de la raíz cuadrada es igual al número original
        return (raiz * raiz == num);
    }
}

