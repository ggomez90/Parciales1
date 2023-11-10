package Escuela_ParcialLabb_AlmarazRodrigo;

public class Uso_Personal {

	public static void main(String[] args) {

	
		Personas miPersona = new Personas (" ", " ", " ");
		Empleado miEmpleado = new Empleado (" ", " ", " ", "", "");
		Alumno miAlumno = new Alumno (" ", " ", " "," " , " ");
		Deportista miDeportista = new Deportista(" ", " ", " ", " ", " ");
	
		

	miPersona.setNombre("Milei");
	miPersona.setApellido("Massing");
	miPersona.setDni("38124812DOLAR");
		
	miDeportista.setCategoria("Full maleta");
	miDeportista.setDeporte("Curling");
	
	miEmpleado.setLegajo("2022");
	miEmpleado.setPuesto("piquetero");
	
	miAlumno.setLegajo("2029");
	miAlumno.setPuesto("repitente");

	miPersona.verPersonas();
miAlumno.verAlumno();
	miEmpleado.verEmpleado();
	miDeportista.verDeportista();

		
	
	

	}

}

