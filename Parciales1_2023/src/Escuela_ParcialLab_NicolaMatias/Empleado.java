/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escuela_ParcialLab_NicolaMatias;


public class Empleado extends Persona{
    public String Legajo;
    public String Puesto;

    public Empleado(String Legajo, String Puesto, String Nombre, String Apellido, String Dni) {
        super(Nombre, Apellido, Dni);
        this.Legajo = Legajo;
        this.Puesto = Puesto;
    }

    public String getLegajo() {
        return Legajo;
    }

    public void setLegajo(String Legajo) {
        this.Legajo = Legajo;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }
       public void ImprirEmpleado(){
    System.out.println("Legajo: "+this.Legajo+ "Puesto: "+this.Puesto);
    
}
}
