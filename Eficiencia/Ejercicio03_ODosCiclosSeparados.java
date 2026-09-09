package Eficiencia;


import java.util.Scanner;

/*
* EJERCICIO 3. Dos ciclos separados — O(n + n) = O(n)
* */

public class Ejercicio03_ODosCiclosSeparados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int contador = 0;

        System.out.println("Primer ciclo:");
        for (int i = 0; i < n; i++) {
            contador++;
            System.out.println("i = " + i);
        }

        System.out.println("Segundo ciclo:");
        for (int j = 0; j < n; j++) {
            contador++;
            System.out.println("j = " + j);
        }

        System.out.println("Total de operaciones: " + contador);
        System.out.println("Análisis: O(n + n) = O(2n) = O(n)");

        sc.close();
    }
}
