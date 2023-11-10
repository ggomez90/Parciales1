package Parcial_Laboratorio_JAMANCA;

public class Alumno extends Persona {
	int num_legajo; //Atributo sin modificador de acceso
	
	public Alumno(String nombre, String apellido, int num_legajo)
	{
		super(nombre, apellido);
		this.num_legajo = num_legajo;
	}
	
	public void setNumLegajo()
	{
		int num;
		System.out.println("Ingrese el numero de legajo: ");
		num = entrada.nextInt();
		this.num_legajo = num;
	}
	
	public int getNumLegajo()
	{
		return this.num_legajo;
	}
	
	public void verAlumno()
	{
		System.out.println("-----------------Alumno------------------");
		System.out.println("Nombre:" + this.nombre);
		System.out.println("Apellido:" + this.apellido);
		System.out.println("Numero de legajo:" + this.num_legajo);
	}
}
