package Parcial_Laboratorio_Buscatamante;
import java.util.Scanner;
public class Alumno extends Persona{
    private int curso;
    private String division;   
public Alumno(){
    super();
    this.curso = 0;
    this.division = "";
}
public Alumno(String nombre, int edad, String sexo, int curso, String division){
    super();
    this.curso = curso;
    this.division = division;
}
public void cambiaCurso(){
    int nuevoCurso;
    Scanner entrada = new Scanner(System.in);
    do
    {
        System.out.println("Ingrese nuevo curso: ");
        nuevoCurso = entrada.nextInt();
    }while(nuevoCurso<1 || nuevoCurso>7);
    this.curso = nuevoCurso;
    System.out.println(nuevoCurso + "Se ha actualizado el curso a: " + nuevoCurso);
}
public void cambiaDivision(){
    String nuevaDivision;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese nueva división: ");
    nuevaDivision = entrada.nextLine();
    this.division = nuevaDivision;
    System.out.println("Se ha actualizado la división a: " + nuevaDivision);
}
public int getCurso(){
    return this.curso;
}
}
