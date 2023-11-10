package Parcial_Laboratorio_BARRERA_LUCIANA;


public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	    

    public void setEdad(int edad)
    {
	    this.edad = edad;
	}
	    
	public int getEdad()
	{
	    return this.edad;
	}
}

/*	public class Main {
	    public static void main(String[] args)
	    {
	        Persona persona1 = new Persona("Luciana", 25);
	   
	        System.out.println("Nombre: " + persona1.getNombre());
	        System.out.println("Edad: " + persona1.getEdad());
	        
	
	        persona1.setNombre("Maria");
	        persona1.setEdad(35);
	        System.out.println("Nombre actualizado: " + persona1.getNombre());
	        System.out.println("Edad actualizada: " + persona1.getEdad());
	    }
	}*/
	
	
