
package Escuela_ParcialLab_VelizSantiago;
import java.util.*;

public class Alumno extends Persona
{     
    private int legajo;
    private String carrera;
    
    public Alumno()
    {
        super();
        this.legajo=000;
        this.carrera="Sin carrera";
    }
    
    public Alumno(String nombre, String apellido, int dni, int legajo, String carrera)
    {
        super(nombre, apellido, dni);
        this.legajo=legajo;
        this.carrera=carrera;
    }
    
    public int getLegajo()
    {
        return this.legajo;
    }
    
    public String getCarrera()
    {
        return this.carrera;
    }
    
    public void setLegajo(int legajo)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero de legajo: ");
        this.legajo=scan.nextInt();
        System.out.println("Realizado");
    }
    
    public void setCerrera(String carrera)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese carrera: ");
        this.carrera=scan.nextLine();
        System.out.println("Realizado");
    }
    
    public void getInfoAlumno()
    {
        System.out.println("Legajo: " + legajo + " | Carrera: " + carrera);
    }
    
}
