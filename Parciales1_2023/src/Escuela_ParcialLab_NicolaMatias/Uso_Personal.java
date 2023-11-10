/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escuela_ParcialLab_NicolaMatias;
public class Uso_Personal{
    
 public static void main(String[] args) {

        Persona persona1 = new Alumno("Matias","Nicola","4165462","1231","Programacion");
        Empleado persona= new Empleado("Guillermo","Gomez", "1234567","1234","Aguatero"); 
        Deportista persona3= new Deportista("Guillermo","Gomez", "1234567", "Basquet","Primera");
        persona1.ImprimirPersona();
        persona.ImprirEmpleado();
        persona3.ImprirDeportista();
 }}