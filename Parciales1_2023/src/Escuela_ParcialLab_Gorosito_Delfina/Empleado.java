
package Escuela_ParcialLab_Gorosito_Delfina;

public class Empleado extends Persona{
    private int legajo;
    private String puesto;
    
 public Empleado(String nombre, String apellido, int dni, int legajo, String puesto){
     super (nombre,apellido,dni);
     this.legajo=legajo;
     this.puesto=puesto;
 }
 public int getLEGAJO(){
     return legajo;
 }
 public void setLEGAJO(int legajo){
     this.legajo=legajo;
 }
 public String getPUESTO (){
     return puesto;
 }
 public void setPUESTO (String puesto){
     this.puesto=puesto;
 }
 
 public void mostrarInfoEMPLEADO(){
     System.out.println("Legajo:"+ legajo);
     System.out.println("Puesto:"+ puesto);
 }
}
