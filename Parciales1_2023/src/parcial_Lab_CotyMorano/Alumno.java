package parcial_Lab_CotyMorano;

public class Alumno extends Persona {
	private int id;

	public Alumno(String nombre, String apellido, int id) {
		super(nombre, apellido);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
