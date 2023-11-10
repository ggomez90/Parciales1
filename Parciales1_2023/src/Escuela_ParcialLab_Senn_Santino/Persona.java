package Escuela_ParcialLab_Senn_Santino;

public class Persona 
{

	private String apellido;
	private String nombre;
	private String dni;

	
	public Persona() 
	{
		this.apellido = " ";
		this.nombre = " ";
		this.dni = " ";
	}
	
	public Persona(String apellido, String nombre, String dni) 
	{
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}

	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getDni() 
	{
		return dni;
	}

	public void setDni(String dni) 
	{
		this.dni = dni;
	}
}