package parte1;

import java.util.Scanner;

public class Ejercicio2_EMC {
	public static Scanner sc = new Scanner(System.in); // crear scanner

	public static void main(String[] args) {

		boolean ejercicio2 = seleccion(sc);
		if (ejercicio2 = true) {
			System.out.println("Programa finalizado con éxito");
		} else {
			System.out.println("Programa finalizado sin éxito");
		}
	}

	public static boolean seleccion(Scanner sc) {
		Double sueldofinal = 0.0; // para cuándo lo pregunta en el for
		System.out.println("Cuántos años tienes?");
		int Edad = sc.nextInt();
		if (Edad > 40) {
			System.out.println("Ha sido descartado del proceso de selección.");
			return false; // devuelve false por tener más de 40
		} else {
			System.out.println("Inserte su nombre");
			String Nombre = sc.nextLine();
			sc.nextLine();
			System.out.println("Cuántos años trabajados tiene?");
			int anyos = sc.nextInt();
			if (anyos > 40) {
				System.out.println("Se ha detectado que tiene más de 40 años.");
				return false; // Si ha trabajado más de 40 años se descarta
			}
			System.out.println("Cuál es su sueldo bruto anual anterior");
			Double sueldoanterior = sc.nextDouble();

			if (sueldoanterior > 30000) {
				System.out.println("Ha sido descartado del proceso de selección.");
				return false; // El sueldo pasa de los 30k€
			} else {
				System.out.println("Como último necesitamos sus últimas 5 nóminas.");
				for (int i = 0; i < 5; i++) {
					System.out.println("Inserta la nómina bruta anterior nº" + (i + 1) + ":");
					Double sueldo = sc.nextDouble();
					sueldofinal = sueldofinal + sueldo;
				}
				System.out.println("----SUMA DE LAS ÚLTIMAS 5 NÓMINAS----\n" + sueldofinal);
				Double average = sueldofinal / 5;
				if (average > 2500) {
					System.out.println("Se le ha incrementado el valor de tu nómina mensual en un 5%");
					System.out.println("--Resultado--\n" + (average * 1.05)
							+ "\n--Basado en el promedio de tus últimas 5 nóminas");
					return true; // en ambos casos se aprueba
				} else {
					System.out.println("Se le ha incrementado el valor de tu nómina mensual en un 10%");
					System.out.println("--Resultado--\n" + (average * 1.10)
							+ "\n--Basado en el promedio de tus últimas 5 nóminas");
					return true; // en ambos casos se aprueba
				}
			}
		}
	}

}