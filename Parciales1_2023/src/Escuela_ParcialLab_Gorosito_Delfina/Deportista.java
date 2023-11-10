
package Escuela_ParcialLab_Gorosito_Delfina;

public class Deportista extends Persona{
    private String deporte;
    private String categoria;
    
 public Deportista(String nombre, String apellido, int dni, String deporte, String categoria){
     super (nombre,apellido,dni);
     this.deporte=deporte;
     this.categoria=categoria;
 }
 public String getDEPORTE(){
     return deporte;
 }
 public void setDEPORTE(String deporte){
     this.deporte=deporte;
 }
 public String getCATEGORIA (){
     return categoria;
 }
 public void setCATEGORIA (String categoria){
     this.categoria=categoria;
 }
 
 public void mostrarInfoDeportista(){
     System.out.println("Deporte:"+ deporte);
     System.out.println("Categoria:"+ categoria);
 }
}
