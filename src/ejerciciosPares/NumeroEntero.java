package ejerciciosPares;

import java.util.Scanner;

public class NumeroEntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.print("Números impares entre 0 y " + numero + ": ");

        for (int i = 1; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
    }
}