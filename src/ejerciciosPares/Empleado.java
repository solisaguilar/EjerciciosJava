package ejerciciosPares;

import java.util.Scanner;

public class Empleado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo del empleado:");
        double sueldo = scanner.nextDouble();

        double descuento = 0.0;
        if (sueldo < 500.00) {
            descuento = 0.00;
        } else if (sueldo >= 500.00 && sueldo < 750.00) {
            descuento = sueldo * 0.05;
        } else if (sueldo >= 750.00) {
            descuento = sueldo * 0.10;
        }


        System.out.println("Monto a descontar: " +  descuento);

    }
}
