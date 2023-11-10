package Escuela_ParcialLab_VelizSantiago;
import java.util.*;

public class Persona 
{
    private String nombre;
    private String apellido;
    private int dni;
    
    public Persona()
    {
        this.nombre="Sin nombre";
        this.apellido="Sin apellido";
        this.dni=00000000;
    }
    
    public Persona(String nombre, String apellido, int dni)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    public int getDni()
    {
        return this.dni;
    }
    
    public void setNombre(String nombre)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nuevo nombre");
        this.nombre= scan.nextLine();
    }
    
    public void setApellido(String apellido)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nuevo apellido");
        this.apellido= scan.nextLine();
    }
    
    public void setDni(int dni)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nuevo dni");
        this.dni= scan.nextInt();
    }
    
    public void getInfoPersona()
    {
        System.out.println("Nombre: " + nombre + " | Apellido: " + apellido + " | Dni: " + dni);
//      el parcial decia solamente mostrar B^)
    }
}
