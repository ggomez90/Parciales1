package Escuela_ParcialLab_Senn_Santino;

public class Empleado extends Persona 
{
	private String puesto;
	private String legajo;

	public Empleado(String apellido, String nombre, String dni, String puesto, String legajo)
	{
		super(apellido, nombre, dni);
		this.puesto = puesto;
		this.legajo = legajo;
	}

	public String getPuesto()
	{
		return puesto;
	}

	public void setPuesto(String puesto)
	{
		this.puesto = puesto;
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