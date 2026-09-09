package Eficiencia;



import java.util.Scanner;

public class Ejercicio05_OCubica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    contador++;
                    System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }

        System.out.println("Total de operaciones: " + contador);
        System.out.println("Complejidad: O(n^3)");

        sc.close();
    }
}