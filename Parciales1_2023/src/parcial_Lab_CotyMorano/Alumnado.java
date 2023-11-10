package parcial_Lab_CotyMorano;

public class Alumnado {

	public static void main(String[] args) {
		Alumno alu1 = new Alumno("Manuel", "Capo Garcia", 4);
		Alumno alu2 = new Alumno ("Rosa", "Peluca de las mercedes",69);
		
		System.out.println("INFO DEL ALUMNO N1: ");
		System.out.println("Nombre:  "+ alu1.getNombre());
		System.out.println("Apellido: " + alu1.getApellido());
		System.out.println("ID: " + alu1.getId());
		
		System.out.println();
		
		System.out.println("INFO ALUMNO N2: ");
		System.out.println("Nombre: " + alu2.getNombre());
		System.out.println("Apellido: " + alu2.getApellido());
		System.out.println("ID: " + alu2.getId());
	}
}
