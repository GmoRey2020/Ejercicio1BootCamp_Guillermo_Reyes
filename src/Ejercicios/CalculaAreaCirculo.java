package Ejercicios;

public class CalculaAreaCirculo {
    public static void main(String[] args) {
        // Declaración e inicialización de la variable
        double r = 7; // radio del círculo

        // Calcular el área del círculo usando la fórmula
        double area = Math.PI * Math.pow(r, 2);

        // Mostrar el resultado
        System.out.println("El área del círculo con radio " + r + " es: " + area);
    }
}
