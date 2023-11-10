package parcial_laboratorio_velizsan;
import java.util.Scanner;
public class Alumnado {
int opc; //opc acá es un atributo de la clase Alumnado, deberia ir dentro del metodo main para cumplir
 		 //con la funcion que queres
Scanner scan = new Scanner (System.in);//scan acá es un atributo de la clase Alumnado, se necesita un objeto
									   //deberia estar dentro del metodo o bien ser un objeto estatico
Persona per1 = new Persona();
    public static void main(String[] args) {
        while(opc!=0){
        System.out.println("Bienvenido, que accion desea realizar?: ");
        System.out.println("1) Verificar alumno");
        System.out.println("2) Verificar estado de alumno");
        System.out.println("3) Cambiar nombre de alumno");
        System.out.println("4) Cambiar estado del alumno");
        System.out.println("0) Salir");
        this.opc = scan.nextInt();    
    while(opc=9)//se asigna el valor 9 al atribuco opc{
        switch (opc){
            case 1://no ingresará nunca
                per1.obtenerDatos;//error en llamadas a metodos
                break;
            case 2://no ingresará nunca
                per1.info;
                break;
            case 3://no ingresará nunca
                per1.cambiarNombre;
                break;
            case 4://no ingresará nunca
                per1.modEstado;
                break;
            default:
                System.out.println("Opcion invalida, ingrese nuevamente: ")
                this.opc = scan.nextInt();
                opc=9;//opc siempre valdrá 9, bucle infinito.
        }
    }
    }
    }
}