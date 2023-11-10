package Escuela_ParcialLabb_AlmarazRodrigo;


public class Empleado extends Personas{

	
	private String legajo;
	private String puesto;
	
	public Empleado (String nombre, String apellido, String dni, String legajo, String puesto)
	{
		super(nombre, apellido, dni);
		this.legajo = legajo;
		this.puesto = puesto;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	
	public void verEmpleado()
	{
		verPersonas();
		System.out.println("Legajo" +legajo);
		System.out.println("Puesto" +puesto);
	}
	
}	
	
		
