package parte1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4_EMC {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random R = new Random();
        String[] Nombres = new String[20]; // Array de nombres de equipo
        int[] Puntuaciones = new int[20];  // Array de puntuaciones

        // Insertar los nombres
        for (int i = 0; i < Nombres.length; i++) {
            System.out.println("Introduce un nombre para el equipo " + (i + 1) + ":");
            Nombres[i] = sc.nextLine();  
        }

        // Con random hacemos que los puntos vayan entre 35 a 100
        for (int i = 0; i < Puntuaciones.length; i++) {
            Puntuaciones[i] = R.nextInt(100 - 35 + 1) + 35;
        }


        // Encontrar ganador, último y calcular la media
        int equipoGanador = 0, equipoUltimo = 0;
        int maxPuntuacion = Puntuaciones[0];
        int minPuntuacion = Puntuaciones[0];
        int sumaTotal = 0;

        // Buscar el equipo con la puntuación más alta, el más bajo y calcular la suma total
        for (int i = 0; i < Puntuaciones.length; i++) {
            sumaTotal += Puntuaciones[i];

            if (Puntuaciones[i] > maxPuntuacion) {
                maxPuntuacion = Puntuaciones[i];
                equipoGanador = i;
            }
            if (Puntuaciones[i] < minPuntuacion) {
                minPuntuacion = Puntuaciones[i];
                equipoUltimo = i;
            }
        }

        // Calcular la media
        double puntuacionMedia = (double) sumaTotal / Puntuaciones.length;

        // Mostrar resultados
        System.out.println("\n--RESULTADOS--");
        System.out.println("GANADOR: " + Nombres[equipoGanador] + " con " + maxPuntuacion + " puntos.");
        System.out.println("ÚLTIMOS: " + Nombres[equipoUltimo] + " con " + minPuntuacion + " puntos.");
        System.out.printf("MEDIA: %.2f%n", puntuacionMedia);
    }
}
