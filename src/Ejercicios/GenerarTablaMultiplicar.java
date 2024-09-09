package Ejercicios;

public class GenerarTablaMultiplicar {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        int a = 7;
        // Mostrar la tabla de multiplicar del número a
        System.out.println("Tabla de multiplicar del " + a + ":");

        // Generar la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            int resultado = a * i;
            System.out.println(a + " x " + i + " = " + resultado);
        }
    }
}
