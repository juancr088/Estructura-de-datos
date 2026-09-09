package Eficiencia;

import java.util.Scanner;

/*
* EJERCICIO 2. Complejidad lineal — O(n)
* El número de operaciones crece proporcionalmente con n.
** */

public class Ejercicio02_OLineal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int contador = 0;

        for (int i = 0; i < n; i++) {
            contador++;
            System.out.println("Iteración: " + i);
        }

        System.out.println("Total de operaciones del ciclo: " + contador);
        System.out.println("Complejidad: O(n)");

        sc.close();
    }
}