package parte1;

import java.util.Scanner;

public class Ejercicio2_EMC {
	public static Scanner sc = new Scanner(System.in); // crear scanner

	public static void main(String[] args) {

		boolean ejercicio2 = seleccion(sc);
		if (ejercicio2 = true) {
			System.out.println("Programa finalizado con �xito");
		} else {
			System.out.println("Programa finalizado sin �xito");
		}
	}

	public static boolean seleccion(Scanner sc) {
		Double sueldofinal = 0.0; // para cu�ndo lo pregunta en el for
		System.out.println("Cu�ntos a�os tienes?");
		int Edad = sc.nextInt();
		if (Edad > 40) {
			System.out.println("Ha sido descartado del proceso de selecci�n.");
			return false; // devuelve false por tener m�s de 40
		} else {
			System.out.println("Inserte su nombre");
			String Nombre = sc.nextLine();
			sc.nextLine();
			System.out.println("Cu�ntos a�os trabajados tiene?");
			int anyos = sc.nextInt();
			if (anyos > 40) {
				System.out.println("Se ha detectado que tiene m�s de 40 a�os.");
				return false; // Si ha trabajado m�s de 40 a�os se descarta
			}
			System.out.println("Cu�l es su sueldo bruto anual anterior");
			Double sueldoanterior = sc.nextDouble();

			if (sueldoanterior > 30000) {
				System.out.println("Ha sido descartado del proceso de selecci�n.");
				return false; // El sueldo pasa de los 30k�
			} else {
				System.out.println("Como �ltimo necesitamos sus �ltimas 5 n�minas.");
				for (int i = 0; i < 5; i++) {
					System.out.println("Inserta la n�mina bruta anterior n�" + (i + 1) + ":");
					Double sueldo = sc.nextDouble();
					sueldofinal = sueldofinal + sueldo;
				}
				System.out.println("----SUMA DE LAS �LTIMAS 5 N�MINAS----\n" + sueldofinal);
				Double average = sueldofinal / 5;
				if (average > 2500) {
					System.out.println("Se le ha incrementado el valor de tu n�mina mensual en un 5%");
					System.out.println("--Resultado--\n" + (average * 1.05)
							+ "\n--Basado en el promedio de tus �ltimas 5 n�minas");
					return true; // en ambos casos se aprueba
				} else {
					System.out.println("Se le ha incrementado el valor de tu n�mina mensual en un 10%");
					System.out.println("--Resultado--\n" + (average * 1.10)
							+ "\n--Basado en el promedio de tus �ltimas 5 n�minas");
					return true; // en ambos casos se aprueba
				}
			}
		}
	}

}