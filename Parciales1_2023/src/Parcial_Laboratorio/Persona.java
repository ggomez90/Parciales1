package Parcial_Laboratorio;//palmier gian

public class Persona {
	int edad;//atributos sin modificador de acceso, no encapsulados
	String nombre;
	
	public Persona() {
		this.edad = 0;
		this.nombre = "Sin datos";
	}
	
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public String verNombre() {
		return this.nombre;
}
	public int verEdad() {
		return this.edad;
}
	
	public void modificarNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
		System.out.println("Nombre modificado con éxito.");
	}
}
