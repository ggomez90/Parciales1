/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escuela_ParcialLab_NicolaMatias;


public class Deportista extends Persona {
    public String Deporte;
    public String Categoria;
    

    public Deportista(String Nombre, String Apellido, String Dni,String Deporte, String Categoria) {
        super(Nombre, Apellido, Dni);
        this.Deporte = Deporte;
        this.Categoria = Categoria;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String Deporte) {
        this.Deporte = Deporte;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
       public void ImprirDeportista(){
    System.out.println("Deporte: "+this.Deporte+ "Categoria: "+this.Categoria);
    
}
}
