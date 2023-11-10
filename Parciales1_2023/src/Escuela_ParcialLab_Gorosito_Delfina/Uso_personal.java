
package Escuela_ParcialLab_Gorosito_Delfina;

public class Uso_personal {

	public static void main (String[]args) {
		
		Empleado empleado1= new Empleado("Guillermo", "Gomez",32456897,60,"empleado");
		
		Alumno alumno1 =new Alumno("Delfina", "Gorosito",44069815,33,"Programacion");
		
		Deportista deportista1= new Deportista("Gian","Palmier",38212345,"futbol","juvenil");
                
               empleado1.mostrarInfoEMPLEADO();
               alumno1.mostrarInfoAlumno();
               deportista1.mostrarInfoDeportista();
                
        }
} 
		
		
