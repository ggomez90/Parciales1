package Escuela_ParcialLab;

class Deportista extends Persona
{
   private String deporte;
   private String categoria;
   
public Deportista(String nombre, String apellido, int dni, String deporte, String categoria)
{
  super(nombre, apellido, dni);
  this.categoria = "Primera";
  this.deporte = "Basquet";
}

public void setCategoria()
{
	this.categoria = categoria;
}

public String getCategoria()
{
	return categoria;
}

public void setDeporte()
{
	this.deporte = deporte;
}

public String getDeporte()
{
	return deporte;
}

public void mostrarDeporte()
{
	System.out.println(deporte + " " + categoria);

}

} 
