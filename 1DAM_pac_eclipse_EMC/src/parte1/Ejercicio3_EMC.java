package parte1;
import java.util.*;
public class Ejercicio3_EMC {

	public static Scanner sc = new Scanner(System.in);
	public static void main (String[]args) {
		System.out.println("Bienvenido a su Entrenamiento Running!");
		PersonaEj3 Usuario = crearusuario(sc);
		
		//Valores que se repiten durante los 10 meses:
		Double Velocidad = 0.0;
		Double Distancia = 0.0;
		Double Calorias = 0.0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("--MES "+i+"--\nInserta Velocidad:");
			Velocidad = sc.nextDouble();
			System.out.println("Distancia:");
			Distancia = sc.nextDouble();
			System.out.println("Calorias quemadas:");
			Calorias = sc.nextDouble();
		}
		
		Double AvgVelocidad = Velocidad /10;
		Double AvgDistancia = Distancia /10;
		Double AvgCalorias = Calorias /10;
		
		String ficha = presentarficha(Usuario);
	}	
	public static PersonaEj3 crearusuario (Scanner sc) {
		String Sexo = "";
		System.out.println("Cuál es su nombre?");
		String Nombre = sc.nextLine();
		System.out.println("Cuál es su edad?");
		int Edad = sc.nextInt();
		System.out.println("Cuánto pesas?");
		Double Peso = sc.nextDouble();
		System.out.println("Cuánto mides?");
		Double Altura = sc.nextDouble();
		System.out.println("Inserta tu género:\n1-Hombre\t2-Mujer");
		int Genero = sc.nextInt();
		//TODO: Meterlo en un while
		switch(Genero) {
		
		case 1: 
			Sexo = "Hombre";
			break;
		case 2:
			Sexo = "Mujer";
			break;
		default:
			System.out.println("No ha insertado un número válido.\n Se te ha dejado como hombre");
			Sexo = "Hombre";
			break;
		}
		System.out.println("Cuál es su Velocidad Inicial (km/h):");
		Double VelocidadInicial = sc.nextDouble();
		System.out.println("Y la distancia Inicial?");
		Double DistanciaInicial = sc.nextDouble();
		System.out.println("Por último, las calorias quemadas inicialmente:");
		Double Calorias = sc.nextDouble();
		
		PersonaEj3 usuaria = new PersonaEj3 (Nombre,Edad,Peso,Altura,Sexo,VelocidadInicial,DistanciaInicial,Calorias);
		return usuaria;
		
	}
	
	public static String presentarficha(PersonaEj3 Usuario) {
		System.out.println("Hola "+Usuario.getNombre()+", te presentamos la ficha de ");
		return "hola";
	}
}
