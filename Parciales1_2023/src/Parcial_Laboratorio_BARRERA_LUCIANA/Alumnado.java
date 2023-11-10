package Parcial_Laboratorio_BARRERA_LUCIANA;

public class Alumnado{

	public static void main(String[] args) { 
		
		Persona persona1 = new Persona("Luciana", 25);
		   
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        

        persona1.setNombre("Maria");
        persona1.setEdad(35);
        System.out.println("Nombre actualizado: " + persona1.getNombre());
        System.out.println("Edad actualizada: " + persona1.getEdad());
		

	}

}
