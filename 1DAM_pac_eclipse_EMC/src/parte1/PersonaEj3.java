package parte1;

public class PersonaEj3 {
	
	private String Nombre;
	private int Edad;
	private Double Peso;
	private Double Altura;
	private String Sexo;
	private Double VelocidadInicial;
	private Double DistanciaInicial;
	private Double CaloriasQuemadasIniciales;

public PersonaEj3(String Nombre,int Edad, Double Peso, Double Altura, String Sexo,
		Double VelocidadInicial, Double DistanciaInicial, Double CaloriasQuemadasIniciales) {

	this.Nombre = Nombre;
	this.Edad = Edad;
	this.Peso = Peso;
	this.Altura = Altura;
	this.Sexo = Sexo;
	this.VelocidadInicial = VelocidadInicial;
	this.DistanciaInicial = DistanciaInicial;
	this.CaloriasQuemadasIniciales = CaloriasQuemadasIniciales;
}

//GETTERS 
public String getNombre() {
	return Nombre;
}

public Double getVelocidadInicial() {
	return VelocidadInicial;
}
public Double getCaloriasQuemadasIniciales() {
	return CaloriasQuemadasIniciales;
}

//SETTERS
public void setVelocidadInicial(Double velocidadInicial) {
	VelocidadInicial = velocidadInicial;
}

public void setCaloriasQuemadasIniciales(Double caloriasQuemadasIniciales) {
	CaloriasQuemadasIniciales = caloriasQuemadasIniciales;
}
}
