package Escuela_ParcialLabb_AlmarazRodrigo;

public class Personas {

	 private String nombre;
	 private String apellido;
	 private String dni;
	 

	 	public Personas(String nombre, String apellido, String dni)
	 	{
	 		this.nombre = nombre;
	 		this.apellido = apellido;
	 		this.dni = dni;
	 	}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellido() {
			return apellido;
		}


		public void setApellido(String apellido) {
			this.apellido = apellido;
		}


		public String getDni() {
			return dni;
		}


		public void setDni(String dni) {
			this.dni = dni;
		}
	 
	 
	public void verPersonas()
		{
			System.out.println("Nombre: "+nombre);
			System.out.println("Apellido: "+apellido);
			System.out.println("Dni: "+dni);

		
		}


	 	
	 	
	}
