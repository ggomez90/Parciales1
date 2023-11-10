package Parcial_Laboratorio_Buscatamante;
import java.util.Scanner;
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
public Persona(){
    this.nombre = "";
    this.edad = 0;
    this.sexo = "";
}
public Persona(String nombre, int edad, String sexo){
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
}
public void cambiaNombre(){
    String nuevoNombre;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese nuevo nomnbre: ");
    nuevoNombre = entrada.nextLine();
    this.nombre = nuevoNombre;
    System.out.println("Se ha actualizado el nombre a: " + nuevoNombre);
}
public void cambiaEdad(){
    int nuevaEdad;
    Scanner entrada = new Scanner(System.in);
    do
    {
       System.out.println("Ingrese nueva edad: ");
       nuevaEdad = entrada.nextInt(); 
    }while(edad <0 || edad >115);
    this.edad = nuevaEdad;
}
public String getNombre(){
    return this.nombre;}
public int getEdad(){
    return this.edad;}
}
