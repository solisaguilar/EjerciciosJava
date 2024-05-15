package ejerciciosPares;

import java.util.Scanner;

public class PartidosGanados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de partidos ganados:");
        int ganados = scanner.nextInt();

        System.out.println("Ingrese el número de partidos empatados:");
        int empatados = scanner.nextInt();

        System.out.println("Ingrese el número de partidos perdidos:");
        int perdidos = scanner.nextInt();

        int puntos = (ganados * 3) + (empatados * 1);

        System.out.println("El equipo ha obtenido "+puntos);

        scanner.close();
    }
}