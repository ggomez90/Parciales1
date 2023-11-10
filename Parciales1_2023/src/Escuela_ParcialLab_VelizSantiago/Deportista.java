
package Escuela_ParcialLab_VelizSantiago;
import java.util.*;

public class Deportista extends Persona
{
    private String deporte;
    private String categoria;
    
    public Deportista()
    {
        super();
        this.deporte="No hace";
        this.categoria="Azul";
    }
    
    public Deportista(String nombre, String apellido, int dni, String deporte, String categoria)
    {
        super(nombre, apellido, dni);
        this.deporte=deporte;
        this.categoria=categoria;
    }
    
     public String getDeporte()
    {
        return this.deporte;
    }
    
    public String getCategoria()
    {
        return this.categoria;
    }
    
    public void setDeporte(String deporte)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese deporte: ");
        this.deporte=scan.nextLine();
        System.out.println("Realizado");
    }
    
    public void setPuesto(String puesto)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese categoria: ");
        this.categoria=scan.nextLine();
        System.out.println("Realizado");
    }
    
    public void getInfoDeportista()
    {
        System.out.println("Deporte:" +deporte+ " | Categoria: "+ categoria);
    }
}
