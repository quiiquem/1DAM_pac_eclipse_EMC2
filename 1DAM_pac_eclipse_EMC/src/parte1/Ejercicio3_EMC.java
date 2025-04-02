package parte1;
import java.util.*;
public class Ejercicio3_EMC {

	public static Scanner sc = new Scanner(System.in);
	public static void main (String[]args) {
		System.out.println("Bienvenido a su Entrenamiento Running!");
		
		//Variables para guardar los datos INICIALES
		Double InicioVelocidad = 0.0;
		Double InicioDistancia = 0.0;
		Double InicioCalorias = 0.0;
		
		PersonaEj3 Usuario = crearusuario(sc,InicioVelocidad,InicioDistancia,InicioCalorias);
	
		
		//Valores que se repiten durante los 10 meses:
		Double Velocidad = 0.0;
		Double Distancia = 0.0;
		Double Calorias = 0.0;
		Double MayorDistancia = 0.0;
		Double MayorCalorias = 0.0;
		
		for(int i = 1; i < 11; i++) { //Es 1 y 11 para que en consola salga mes 1 hasta mes 10
			System.out.println("--MES "+i+"--\nInserta Velocidad:");
			Velocidad = sc.nextDouble();
			System.out.println("Distancia:");
			Distancia = sc.nextDouble();
			if(MayorDistancia < Distancia) {
				MayorDistancia = Distancia;
			}
			System.out.println("Calorias quemadas:");
			Calorias = sc.nextDouble();
			if(MayorCalorias < Calorias) {
				MayorCalorias = Calorias;
			}
		}
		
		Double AvgVelocidad = Velocidad /10;
		Double AvgDistancia = Distancia /10;
		Double AvgCalorias = Calorias /10;
		
		String ficha = presentarficha(Usuario,AvgVelocidad,AvgDistancia,AvgCalorias
				,MayorDistancia,MayorCalorias);
		System.out.println("-------INFORMACI�N COPILADA------");
		System.out.println(ficha);
		String ficha2 = ratingficha(ficha,InicioVelocidad,InicioDistancia,InicioCalorias,
				AvgVelocidad,AvgDistancia,AvgCalorias);
		System.out.println("-------RESULTADOS FINALES------");
		System.out.println(ficha2);
	}	
	public static PersonaEj3 crearusuario (Scanner sc,Double InicioVelocidad, Double InicioDistancia,Double InicioCalorias) {
		String Sexo = "";
		System.out.println("Cu�l es su nombre?");
		String Nombre = sc.nextLine();
		System.out.println("Cu�l es su edad?");
		int Edad = sc.nextInt();
		System.out.println("Cu�nto pesas?");
		Double Peso = sc.nextDouble();
		System.out.println("Cu�nto mides?");
		Double Altura = sc.nextDouble();
		boolean terminargenero = false;
		while(!terminargenero) {
		System.out.println("Inserta tu g�nero:\n1-Hombre\t2-Mujer");
		int Genero = sc.nextInt();
	
		switch(Genero) {
		
		case 1: 
			Sexo = "Hombre";
			terminargenero = true;
			break;
		case 2:
			Sexo = "Mujer";
			terminargenero = true;
			break;
		default:
			System.out.println("No ha insertado un n�mero v�lido.");
			Sexo = "Hombre";
			break;
		}}
		System.out.println("Cu�l es su Velocidad Inicial (km/h):");
		 InicioVelocidad = sc.nextDouble();
		System.out.println("Y la distancia Inicial?");
		 InicioDistancia = sc.nextDouble();
		System.out.println("Por �ltimo, las calorias quemadas inicialmente:");
		 InicioCalorias = sc.nextDouble();
		
		PersonaEj3 usuaria = new PersonaEj3 (Nombre,Edad,Peso,Altura,Sexo,InicioVelocidad,InicioDistancia,InicioCalorias);
		return usuaria;
		
	}
	
	public static String presentarficha(PersonaEj3 Usuario,Double AvgVelocidad, Double AvgDistancia, Double AvgCalorias
			,Double MayorDistancia,Double MayorCalorias) {
		String ficha = ("Hola "+Usuario.getNombre()+", te presentamos la ficha de seguimiento de entrenamiento:"
				+ "\nEdad: "+Usuario.getEdad()
				+"\nPeso: "+Usuario.getPeso()
				+"\nAltura: "+Usuario.getAltura()
				+"\nSexo: "+Usuario.getSexo()
				+"\n�ndice de masa corporal: "+(Usuario.getPeso()/Usuario.getAltura())
				+"\nLa media del entrenamiento en 10 sesiones es:"
				+ "\nVelocidad: "+AvgVelocidad
				+"\nDistancia recorrida: "+AvgDistancia
				+"\nCalor�as quemadas: "+AvgCalorias
				+"\nM�xima distancia recorrida: "+MayorDistancia
				+"\nM�ximo n�mero de calor�as quemadas en una sesi�n"+MayorCalorias);
				return ficha;
	}
	
	public static String ratingficha(String ficha,Double InicioVelocidad,Double InicioDistancia,Double InicioCalorias,
			Double AvgVelocidad, Double AvgDistancia,Double AvgCalorias) {
		String ficha2 = "";
		int casoswitch = 0;
		//Al ser un mensaje por cada tipo de superaci�n, he decidido hacerlo un switch
		if (AvgVelocidad> InicioVelocidad) {
			casoswitch = 1;
		} else if (AvgDistancia > InicioDistancia) {
			casoswitch = 2;
		} else if (AvgCalorias > InicioCalorias) {
			casoswitch = 3;
		} else {
			ficha2= "No ha podido superar ninguna caracter�stica inicial.";
		}
		
		switch(casoswitch) {
		case 1:
			ficha2= "Has superado tu velocidad inicial!\nVelocidad Inicial:"+InicioVelocidad
					+"\tVelocidad Media: "+AvgVelocidad;
			return ficha2;
		case 2:
			ficha2= "Has superado tu distancia inicial!\nDistancia Inicial:"+InicioDistancia
					+"\tDistancia Media: "+AvgDistancia;
			return ficha2;
		case 3:
			ficha2= "Has superado tu calor�as quemadas!\nCalor�as quemadas Inicial:"+InicioCalorias
					+"\tCalor�as Quemadas promedias: "+AvgCalorias;
			return ficha2;
		}
		return ficha2;
	}
}
