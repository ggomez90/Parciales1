package Escuela_ParcialLab_Senn_Santino;

public class Uso_Personal 
{

	public static void main(String[]args)
	{
		Alumno alumner = new Alumno("Franquito", "Rinaldi", "45454545", "Medicina", "1");
		Empleado worker = new Empleado ("Fernando Espinoza", "Kirschneristista", "54545454", "Chorro", "4");
		Deportista deportister = new Deportista ("El coco", "Basile", "44445555", "Tienen que cerrar el estadio, eso hacen los genios", "9");
		
		System.out.println("Los datos solicitados del alumno son: ");
		System.out.println("Apellido: "+ alumner.getApellido());
		System.out.println("Nombre: " + alumner.getNombre());
		System.out.println("Dni: " + alumner.getDni());
		System.out.println("Carrera: " + alumner.getCarrera());
		System.out.println("Legajo: " + alumner.getLegajo());
		
		System.out.println("");
		
		System.out.println("Los datos solicitados del empleado son: ");
		System.out.println("Apellido: " + worker.getApellido());
		System.out.println("Nombre: " + worker.getNombre());
		System.out.println("Dni: " + worker.getDni());
		System.out.println("Puesto: " + worker.getPuesto());
		System.out.println("Legajo: " + worker.getLegajo());
		
		System.out.println("");
		
		System.out.println("Los datos solicitados del deportista son: ");
		System.out.println("Apellido: "+ deportister.getApellido());
		System.out.println("Nombre: " + deportister.getNombre());
		System.out.println("Dni: " + deportister.getDni());
		System.out.println("Deporte: " + deportister.getDeporte());
		System.out.println("Categoria: " + deportister.getCategoria());
	}
}