
package Escuela_ParcialLab_VelizSantiago;
import java.util.*;

public class Empleado extends Persona 
{
    private int legajo;
    private String puesto;
    
    public Empleado()
    {
        super();
        this.legajo=000;
        this.puesto="Lo corrieron ayer";
    }
    
    public Empleado(String nombre, String apellido, int dni, int legajo, String puesto)
    {
        super(nombre, apellido, dni);
        this.legajo=legajo;
        this.puesto=puesto;
    }
    
    public int getLegajo()
    {
        return this.legajo;
    }
    
    public String getPuesto()
    {
        return this.puesto;
    }
    
    public void setLegajo(int legajo)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero de legajo: ");
        this.legajo=scan.nextInt();
        System.out.println("Realizado");
    }
    
    public void setPuesto(String puesto)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese puesto: ");
        this.puesto=scan.nextLine();
        System.out.println("Realizado");
    }
    
    public void getInfoEmpleado()
    {
        System.out.println("Legajo: " + legajo + " | puesto" + puesto);
    }
}
