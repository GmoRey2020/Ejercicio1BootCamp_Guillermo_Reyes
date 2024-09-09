package Ejercicios;

public class CalculaAreaCirculo {
    public static void main(String[] args) {
        double r = 7; // radio del círculo
        // Calcular el área del círculo usando la fórmula
        double area = Math.PI * Math.pow(r, 2);

        System.out.println("El área del círculo con radio " + r + " es: " + area);
    }
}
