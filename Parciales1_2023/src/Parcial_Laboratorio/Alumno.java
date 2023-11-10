package Parcial_Laboratorio;//palmier gian

import java.util.Scanner;

public class Alumno extends Persona {
	int legajo;//atributo no encapsulado
	
	public Alumno(int edad, String nombre, int legajo) {
		super(edad, nombre);
		this.legajo = legajo;
	}
	
	public void modificarLegajo(int legajo) {
		
		this.legajo = legajo;
		System.out.println("Legajo modificado con éxito.");
	}
	
	public int verLegajo() {
		return this.legajo;
	}
}

