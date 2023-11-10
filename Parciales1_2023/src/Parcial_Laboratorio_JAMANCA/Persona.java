package Parcial_Laboratorio_JAMANCA;
import java.util.*;
public class Persona {
	String nombre; //atributos sin modificador de acceso
	String apellido;
	Scanner entrada = new Scanner (System.in); // este objeto Scanner acá es un atributo de la clase Persona
	public Persona(){
		this.nombre = "";
		this.apellido = "";
	}
	
	public Persona(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void setNombre(){
		String nombre;
		System.out.println("Ingrese el nombre");
		nombre = entrada.nextLine();
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setApellido(){
		String apellido;
		System.out.println("Ingrese el apellido: ");
		apellido = entrada.nextLine();
		this.apellido = apellido;
	}
	
	public String getApellido(){
		return this.apellido;
	}	
}
