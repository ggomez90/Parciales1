package Parcial_Laboratorio_Campos_Rosario;

import java.util.Scanner;

public class Alumno extends Persona{
	
	private String apellido;//apellido y nombre son atributos propios de una persona
	private String nombre; //en esta clase se deberia haber declarado al menos 1 atributo de un alumno
	
	public Alumno(String sexo, int edad, String apellido, String nombre)
	{
		super(sexo, edad);
		this.apellido = apellido;
		this.nombre = nombre;
	} 
	public void modificarNmobre(String nombre)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		nombre = entrada.nextLine();
		this.nombre = nombre;
	}
	public void modificarApellido(String apellido)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese su apellido: ");
		apellido = entrada.nextLine();
		this.apellido = apellido;
	}
	public String devolverApellido(String apellido)//pide un parametro innecesario
	{
		return this.apellido; 
	}
}
