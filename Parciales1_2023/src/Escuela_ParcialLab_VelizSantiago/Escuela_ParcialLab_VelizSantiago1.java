package Escuela_ParcialLab_VelizSantiago;

public class Escuela_ParcialLab_VelizSantiago1
{
    public class Uso_personal
    {    
        public static void main(String[] args) 
        {
            Alumno alumno1 = new Alumno("Santiago", "Veliz", 43770046, 321, "Programacion");
            Empleado empleado1 = new Empleado("Guillote", "Gomez", 40212312, 021, "Profesor");
            Deportista deportista1 = new Deportista("Leonel", "Messi", 4012321, "Furbol", "El mas pro");
            
            alumno1.getInfoAlumno();
            empleado1.getInfoEmpleado();
            deportista1.getInfoDeportista();
        }
    }
}
