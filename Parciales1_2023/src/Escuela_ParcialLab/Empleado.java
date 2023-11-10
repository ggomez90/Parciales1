package Escuela_ParcialLab;

class Empleado extends Persona
{
  private int legajo; //atributos
  private String puesto;
	
public Empleado(String nombre, String apellido, int dni, int legajo, String puesto)
{
  super(nombre, apellido, dni);
  this.legajo = 7815;
  this.puesto = "Supervisor";
}

public void setLegajo()
{
	this.legajo = legajo;
}

public int getLegajo()
{
	return legajo;
}

public void setPuesto()
{
	this.puesto = puesto;
}

public String getPuesto()
{
	return puesto;
}

public void mostrarEmpleado()
{
  System.out.println( puesto + " " + legajo );
  
}

}
