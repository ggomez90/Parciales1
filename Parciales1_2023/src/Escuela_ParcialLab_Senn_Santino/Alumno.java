package Escuela_ParcialLab_Senn_Santino;

public class Alumno extends Persona 
{
	private String carrera;
	private String legajo;

	public Alumno(String apellido, String nombre, String dni, String carrera, String legajo)
	{
		super(apellido, nombre, dni);
		this.carrera = carrera;
		this.legajo = legajo;
	}

	public String getCarrera()
	{
		return carrera;
	}

	public void setCarrera(String carrera)
	{
		this.carrera = carrera;
	}
	
	public String getLegajo()
	{
		return legajo;
	}

	public void setLegajo(String legajo)
	{
		this.legajo = legajo;
	}
}