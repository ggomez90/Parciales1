package Escuela_ParcialLabb_AlmarazRodrigo;





public class Deportista extends Personas{

	protected String deporte;
	protected String categoria;
	
	public Deportista (String nombre, String apellido, String dni, String deporte, String categoria)
	{
		super(nombre, apellido, dni);
		this.deporte = deporte;
		this.categoria = categoria;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	public void verDeportista ()
	{
		verPersonas();
			System.out.println("Deporte: " +deporte);
			System.out.println("categoria: " +categoria);
	}
		



}
