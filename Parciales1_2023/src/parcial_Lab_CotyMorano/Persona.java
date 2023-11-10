package parcial_Lab_CotyMorano;

public class Persona {

	private String nombre;
	private String apellido;
	
	public Persona() {
		this.nombre="";
		this.apellido="";
	}
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	
	
	
}
