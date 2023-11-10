package parcial_laboratorio_velizsan;
import java.util.Scanner;
public class Persona {
    Scanner entrada= new Scanner (System.in); //entrada acá es un atributo para cada objeto de tipo Persona
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona()
    {
        this.nombre="No registrado";
        this.apellido="No registrado";
        this.edad=0;
    }
    
    public Persona(String nombre, String apellido, int edad)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    
    public String obtenerDatos()
    {
     String nombreComp = "Nombre" + apellido + nombre + " | Edad: " + edad;
     return nombreComp;
    }
    
    public void cambiarNombre()
            {
                System.out.println("Ingrese apellido nuevo: ");
                this.apellido = entrada.nextLine();
                System.out.println("Ingrese Nombre nuevo: ");
                this.nombre = entrada.nextLine();
                System.out.println("Nombre cambiado con exito?");
            }
}