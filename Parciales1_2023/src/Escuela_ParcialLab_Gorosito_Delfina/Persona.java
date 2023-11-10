
package Escuela_ParcialLab_Gorosito_Delfina;

public class Persona {
   String nombre;
   String apellido;
   int dni;
   
   public Persona (String nombre, String apellido, int dni){
       this.nombre=nombre;
       this.apellido=apellido;
       this.dni=0;
   }
   public String getNombre (){
       return nombre;
   }
   public void setNombre (String nombre){
       this.nombre= nombre;
   }
   public String getApellido (){
       return apellido;
   }
    public void setApellido (String apellido){
        this.apellido=apellido;
    }
    public int getDNI (){
        return dni;
    }
    public void setDNI (int dni){
        this.dni=dni;
    }
    
    public void mostrarINFO (){
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:"+ apellido);
        System.out.println("DNI:"+ dni);
    }
}
