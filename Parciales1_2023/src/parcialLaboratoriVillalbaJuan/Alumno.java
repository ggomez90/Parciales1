package parcialLaboratoriVillalbaJuan;
import java.util.Scanner;

public class Alumno extends Persona{
	private String direccion;
	
	public Alumno (){
		super();
		this.direccion = "";		
	}
	
	public Alumno(int legajo, String nombre, String apellido){
		super(legajo, nombre, apellido);
		this.direccion = direccion;	
	}
	
	public void cambiarDireccion(){
		String nuevaDireccion; 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese una Direccion");
		nuevaDireccion = entrada.nextLine();
		this.direccion = nuevaDireccion;
	}
	
	public void devolverDireccion(){
		System.out.println("Direccion: " + this.direccion);
	}

	public void verDatos(){
		super.devolverLegajo();
		super.devolverApellido();
		super.devolverNombre();
		devolverDireccion();
	}
}
