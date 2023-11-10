/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escuela_ParcialLab_NicolaMatias;


public class Persona {
    private String Nombre;
    private String Apellido;
    private String Dni;  

    public Persona(String Nombre, String Apellido, String Dni) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDni() {
        return Dni;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }
    public void ImprimirPersona() {
    System.out.println("Nombre: "+this.Nombre+ "Apellido: "+this.Apellido+ "Dni: "+this.Dni);
}
}


