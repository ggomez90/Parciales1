package parcial_laboratorio_velizsan;
import java.util.Scanner;

public class Alumno extends Persona {
    Scanner scann = new Scanner (System.in);//scann acá es un atributo para cada objeto Alumno
    
    private boolean libre;
    
    public Alumno()
    {
        super();
        this.libre=true;
    }
    
    public String info(String apellido)
    {
       String estado = "Apellido: " + apellido + " | Condicion: " + libre;
       return estado;
    }
    
    public void modEstado()
    {
        System.out.println("Confirme estado del alumno (R para Regular | L para Libre): ");
        String confirm = scann.nextLine();
        if (confirm='R' || confirm='r') //Se está haciendo una asignacion confirm = r
        {
            this.libre=true;
        } 
        else if (confirm = 'L' || 'l' = confirm)//No es posible comparar cadenas con ==, usar metodo equals
        {
            this.libre=false;
        }
    }
}
//Veliz santiago