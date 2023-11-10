package Parcial_Laboratorio_BARRERA_LUCIANA;

public class Alumno extends Persona{
	  
	    private double apellido;//apellido de tipo double??
	    
	    public Alumno(String nombre, int edad, double apellido)
	    {
	        super(nombre, edad);
	        this.apellido = apellido;
	    }
	    
	    public void setApellido(double apellido) {
	        this.apellido = apellido;
	    }
	   
	    public double getApellido() {
	        return this.apellido;
	    }
}