package Escuela_ParcialLab;


class Persona 
{
    private String nombre; //atributos
    private String apellido;
	private int dni;
	
public Persona(String nombre, String apellido, int dni)
{
  this.nombre = "Francisco";
  this.apellido = "Mandrille";
  this.dni = 44251794;
}

public void setNombre()
{
    this.nombre = nombre;	
}

public String getNombre()
{
	return nombre;
}

public void setApellido()
{
	this.apellido = apellido;
}

public String getApellido()
{
   return apellido;	
}

public void setDni()
{
	this.dni = dni;
}

public int getDni()
{
	return dni;
}

public void mostrarPersona()
{
   System.out.println(nombre + apellido + dni);
}

}
