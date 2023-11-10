package Escuela_ParcialLab_Senn_Santino;

public class Deportista extends Persona
{
	private String deporte;
	private String categoria;

	public Deportista(String apellido, String nombre, String dni, String deporte, String categoria)
	{
		super(apellido, nombre, dni);
		this.deporte = deporte;
		this.categoria = categoria;
	}

	public String getDeporte()
	{
		return deporte;
	}

	public void setDeporte(String deporte)
	{
		this.deporte = deporte;
	}
	
	public String getCategoria()
	{
		return categoria;
	}

	public void setCategoria(String categoria)
	{
		this.categoria = categoria;
	}
}