package Escuela_ParcialLabb_AlmarazRodrigo;



public class Alumno extends Personas {
		
		private String legajo;
		private String puesto;

		
		public Alumno (String nombre, String apellido, String dni, String legajo, String puesto)
		{
			super(nombre, apellido, dni);
			this.legajo = legajo;
			this.puesto = puesto;
		}

		
		
		public String getLegajo() {
			return legajo;
		}



		public void setLegajo(String legajo) {
			this.legajo = legajo;
		}



		public String getPuesto() {
			return puesto;
		}



		public void setPuesto(String puesto) {
			this.puesto = puesto;
		}


	
	public void verAlumno ()
	{
		verPersonas();
		System.out.println("Legajo" +legajo);
		System.out.println("Puesto" +puesto);
		}
}
