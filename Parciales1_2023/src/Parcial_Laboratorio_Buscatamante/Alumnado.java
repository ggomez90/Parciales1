package Parcial_Laboratorio_Buscatamante;

public class Alumnado {
   public static void main(String[] args) {
        String nombre = "Rodrigo Bustamante";
        String sexo = "M"; 
        String division = "A";
        int edad = 32;
        int curso = 1;
        Alumno alumno1 = new Alumno(nombre, edad, sexo, curso, division);
        alumno1.cambiaCurso();
        alumno1.cambiaNombre();
    } 
}
