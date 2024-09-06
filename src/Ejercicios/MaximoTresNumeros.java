package Ejercicios;

public class MaximoTresNumeros {
    public static void main(String[] args) {
        // Declaración e inicialización de las variables
        int a = 5;
        int b = 12;
        int c = 9;
        int maximo;
        // Comparaciones para encontrar el máximo
        if (a >= b && a >= c) {
            maximo = a; // a es mayor o igual que b y c
        } else if (b >= a && b >= c) {
            maximo = b; // b es mayor o igual que a y c
        } else {
            maximo = c; // c es mayor que a y b
        }
        System.out.println("El número mayor es: " + maximo);
    }
}
