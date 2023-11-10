/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial_Laboratoriodelfigorosito;

/**
 *
 * @author Punto Digital
 */
public class alumno extends persona{
    private String nombre;
    private String apellido;
    private double nota;
    
public alumno()
{
    super();
    this.nombre = "";
    this.apellido = "";
    this.nota  = 0;
}

public alumno(int legajo, int ubicacion, string nombre, int apellido, double nota) {
    super( legajo, ubicacion); //la clase persona no posee atributos
    this.nombre = nombre;
    this.apellido = apellido;
    this.nota = nota;
}

