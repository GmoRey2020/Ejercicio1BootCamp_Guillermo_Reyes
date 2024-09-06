package Ejercicios;

public class RaizCuadradaSinLibreria {
    // utilizar el método de aproximación de Herón (o método de Newton-Raphson). Este es un método iterativo para encontrar aproximaciones de las raíces cuadradas.
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        double a = 49;

        // Establecer una precisión para la aproximación
        double precision = 1e-10; // Puede ajustarse según sea necesario
        double estimacion = a; // Una estimación inicial
        double diferencia;

        // Método de aproximación de Herón (Newton-Raphson)
        do {
            double nuevaEstimacion = 0.5 * (estimacion + a / estimacion);
            diferencia = Math.abs(nuevaEstimacion - estimacion);
            estimacion = nuevaEstimacion;
        } while (diferencia > precision);

        // Mostrar el resultado
        System.out.println("La raíz cuadrada de " + a + " es aproximadamente: " + estimacion);
    }
}
