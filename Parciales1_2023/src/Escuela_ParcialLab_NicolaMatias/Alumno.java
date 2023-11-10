/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escuela_ParcialLab_NicolaMatias;


public class Alumno extends Persona {
    public String Legajo;
    public String Carrera;

    public String getLegajo() {
        return Legajo;
    }

    public void setLegajo(String Legajo) {
        this.Legajo = Legajo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public Alumno(String Legajo, String Carrera, String Nombre, String Apellido, String Dni) {
        super(Nombre, Apellido, Dni);
        this.Legajo = Legajo;
        this.Carrera = Carrera;
    }
    
    public void ImprimirAlumno(){
    System.out.println("Legajo: "+this.Legajo+ "Carrera: "+this.Carrera);
}
}
