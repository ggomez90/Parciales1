package Parcial_Laboratorio_Campos_Rosario;
import java.util.*;
public class Persona {
	
	private String sexo;
	private int edad; 
	
	public Persona()
	{
		this.sexo = "";
		this.edad = 0;
	}
	public Persona (String sexo, int edad)
	{
		this.sexo = sexo;
		this.edad = edad;
	}
	public String devolverSexo(String sexo)//el parametro para que lo solicitas?
	{
		return this.sexo;
	}
	public void modificarEdad(int edad)//edad viene como parametro y dentro del metodo se vuelve a solicitar
	{
		Scanner entrada = new Scanner(System.in);
		do
		{
			System.out.println("Ingrese su edad: ");
			edad = entrada.nextInt();
		}while(edad<=0);
		this.edad = edad;
	}
 
}
