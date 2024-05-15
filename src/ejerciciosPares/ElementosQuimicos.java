package ejerciciosPares;

import java.util.Scanner;

public class ElementosQuimicos {
    public static void main(String[] args) {
        String[] elementos = new String[8];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el nombre del elemento químico " + (i + 1) + ": ");
            elementos[i] = scanner.nextLine();
        }

        System.out.println("\nElementos en orden inverso:");
        for (int i = 7; i >= 0; i--) {
            System.out.println(elementos[i]);
        }

        scanner.close();
    }
}