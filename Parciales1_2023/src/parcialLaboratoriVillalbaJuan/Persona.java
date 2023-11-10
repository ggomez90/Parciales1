package parcialLaboratoriVillalbaJuan;
import java.util.Scanner;
public class Persona {
	private int legajo;
	private String nombre;
	private String apellido;
	public Persona(){
		this.legajo = 0;
		this.nombre = "";
		this.apellido = "";}
	public Persona(int legajo, String nombre, String apellido){
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;}
	public void cambiarLegajo(){
		int nuevoLegajo; 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un Nº de Legajo");
		nuevoLegajo = entrada.nextInt();
		this.legajo = nuevoLegajo;}
	public void devolverLegajo(){
		System.out.println("Legajo Nº: " + this.legajo);}
	public void cambiarNombre(){
		String nuevoNombre; 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese Nombre");
		nuevoNombre = entrada.nextLine();
		this.nombre = nuevoNombre;}
	public void devolverNombre(){
		System.out.println("Nombre: " + this.nombre);}
	public void cambiarApellido(){
		String nuevoApellido; 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese Apellido");
		nuevoApellido = entrada.nextLine();
		this.apellido = nuevoApellido;}
	public void devolverApellido(){
		System.out.println("Apellido: " + this.apellido);}		
}
