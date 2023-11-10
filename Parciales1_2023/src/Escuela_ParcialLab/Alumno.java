package Escuela_ParcialLab;

class Alumno extends Persona 
{
    private int legajo;//atributo
	private String carrera;
	
public Alumno(String nombre, String apellido, int dni, int legajo, String carrera)
{
	super(nombre, apellido, dni);
	this.carrera = "Programacion";
	this.legajo = 7815;
}

public void setCarrera()
{
   this.carrera = carrera;	
}

public String getCarrera()
{
   return carrera;	
}

public void setLegajo()
{
	this.legajo = legajo;
}

public int getLegajo()
{
	return legajo;
}

public void mostrarCarrera()
{
	System.out.println(carrera + " " + legajo);
}
}
