package Escuela_ParcialLab;

public class Uso_Personal 
{

	public static void main(String[] args) 
	{	
		Empleado empleado = new Empleado("Francisco", "Mandrille", 44251794, 7815, "Supervisor");
			
        empleado.mostrarEmpleado();
        
        Alumno alumno = new Alumno("Francisco", "Mandrille", 44251794,7815, "Programacion");
        
        alumno.mostrarCarrera();
        
        Deportista deportista = new Deportista("Francisco", "Mandrille", 44251794, "Basquet", "Primera");
        
        deportista.mostrarDeporte();
	}
}

