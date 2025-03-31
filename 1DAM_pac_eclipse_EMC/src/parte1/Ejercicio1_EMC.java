package parte1;

import java.util.Scanner;

public class Ejercicio1_EMC {

	public static Scanner sc = new Scanner(System.in); // crear scanner

	public static void main(String[] args) {

		boolean proyectosterminados = auditoriaEmpresa(sc);

		if (proyectosterminados == true) {
			System.out.println("Programa finalizado con �xito.");
		} else {
			System.out.println("Programa finalizado sin �xito.");
		}
	}

	public static boolean auditoriaEmpresa(Scanner sc) { // M�todo que comprueba si ha terminado los proyectos acordados
		// Variables necesarias para poder realizar el m�todo
		Double SalarioJefe = 0.0;
		Double SalarioEncargado = 0.0;
		Double SalarioOficinistas = 0.0;
		int numeroOficinistas = 0;
		Double presupuestoEmpresa = 0.0;

		System.out.println("�Ha terminado los proyectos?\nPulse 1 si las ha terminado, en caso contrario pulse otro");
		int tecla = sc.nextInt();
		if (tecla == 1) {
			// Preguntas sobre los gastos en sueldos globales
			System.out.println("Bien hecho!");
			System.out.println("Necesito el gasto acumulado globalmente,\nprimero inserta el sueldo del jefe");
			SalarioJefe = sc.nextDouble();
			System.out.println("Ahora el sueldo del encargado");
			SalarioEncargado = sc.nextDouble();
			System.out.println("Por �ltimo, necesito saber la cantidad de todos los oficinistas");
			numeroOficinistas = sc.nextInt();
			System.out.println("y el sueldo de los oficinistas:");
			SalarioOficinistas = sc.nextDouble();
			Double SalarioGlobal = SalarioJefe + SalarioEncargado + (numeroOficinistas * SalarioOficinistas); // Salario
																											// global
			if (SalarioGlobal > 20000) { // Caso de que si los pase:
				System.out.println("No ha pasado la auditor�a ya que el gasto en personal es de " + SalarioGlobal + ""
						+ "\ny excede el l�mite mensual de 20.000�");
				return false; // devuelve false para terminar sin �xito
			} else {
				System.out.println("Inserta tu presupuesto en la Empresa");
				presupuestoEmpresa = sc.nextDouble();
				if (presupuestoEmpresa > 100000) { //Comprueba si la empresa no tiene m�s de 100.000� en presupuesto
					System.out.println("No ha pasado la auditor�a ya que el gasto en"
							+ "presupuesto asignado de "+presupuestoEmpresa+"excede \nel l�mite "
									+ "establecido en 100.000�"); //si pasa los 100K no les damos la ayuda
					return false;
				} else {
					System.out.println("Enhorabuena!! Ha pasado la auditor�a, nos vemos el a�o que viene.");
					return true;
				}
			}

		} else {
			return false;
		}
	}
}
