package Rodrigo_Almaraz_Parcial_laboratorio;
import java.util.Scanner;

public class Persona {

	String nombre; //atributos sin modificador de acceso
	int edad;
		
		
			public void PedirDatos()
		{
			System.out.println("Ingrese los datos de la persona: ");
			System.out.println("Nombre de la persona");
			Scanner entrada = new Scanner (System.in);
			this.nombre = entrada.nextLine();
			
			System.out.println("Ingrese edad: ");
			Scanner entrada1 = new Scanner (System.in);
			this.edad = entrada1.nextInt();
		}	
			public Persona(String nombre,int edad) { //constructor incompleto
		
		this.nombre = nombre;
	
	}
	public void dato()	
	{
		System.out.println("El" + nombre +  "edad" + edad);
	}
	public String getNombre() 
		{
			return nombre;
		}
	}

		
		
		

