package Parcial_Laboratorio_JAMANCA;
import java.util.*;
public class Alumnado {
	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Sofia", "Jamanca", 5440);
		alumno1.verAlumno();
		System.out.println("Vamos a cambiar el apellido: ");
		alumno1.setApellido();
		System.out.println("Apellido del alumno cambiado, ahora es: " + alumno1.getApellido());
		System.out.println("--------Ahora vamos a ingresar otro alumno--------");
		ingresarAlumno();
	}
	
	public static void ingresarAlumno()
	{
		Scanner entrada = new Scanner (System.in);
		String nombre, apellido; int num_legajo;
		System.out.println("Ingrese datos de su alumno: ");
		System.out.println("Nombre: ");
		nombre = entrada.nextLine();
		System.out.println("Apellido: ");
		apellido = entrada.nextLine();
		System.out.println("Numero de legajo: ");
		num_legajo = entrada.nextInt();
		while(num_legajo < 0)
		{
			System.out.println("No existen legajos negativos, vuelva a ingresar");
			System.out.println("Numero de legajo:");
			num_legajo = entrada.nextInt();
		}
		Alumno alumno = new Alumno(nombre, apellido, num_legajo);
		alumno.verAlumno();
	}
}
