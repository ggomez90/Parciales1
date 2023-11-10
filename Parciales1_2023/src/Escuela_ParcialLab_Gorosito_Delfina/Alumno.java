
package Escuela_ParcialLab_Gorosito_Delfina;


public class Alumno extends Persona{
    private int legajo;
    private String carrera;
    
 public Alumno(String nombre, String apellido, int dni, int legajo, String carrera){
     super (nombre,apellido,dni);
     this.legajo=legajo;
     this.carrera=carrera;
 }
 public int getLEGAJO(){
     return legajo;
 }
 public void setLEGAJO(int legajo){
     this.legajo=legajo;
 }
 public String getCarrera (){
     return carrera;
 }
 public void setCarrera (String carrera){
     this.carrera=carrera;
 }
 
 public void mostrarInfoAlumno (){
     System.out.println("Legajo:"+ legajo);
     System.out.println("Carrera:"+ carrera);
 }
}
