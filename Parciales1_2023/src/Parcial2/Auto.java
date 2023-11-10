package Parcial2;

public class Auto {

	//Zona de Atributos
    Motor miMotor = new Motor(20);
    Odometro miOdometro = new Odometro();
    TanqueCombustible miTanque = new TanqueCombustible();
    //Zona de Métodos       
    public void ArrancarAuto()
    {
        miMotor.EncenderMotor();
    }
     
    public void AvanzarAuto(int velocidad)
    {
         
        miTanque.setCantidadCombustibleTanque(40);
        int gastoCombustible;
        int milliseconds = 10;

        if (velocidad < 20)
            gastoCombustible = 1;
        else
            if ((velocidad % 10) == 0)
                gastoCombustible = 2;
            else
                gastoCombustible = 1;

        for (int i=0; ; i++)
        {
            miOdometro.setDistanciaRecorrida(i);
             
            if ((miOdometro.getDistanciaRecorrida() % 100) == 0)
                miTanque.setCantidadCombustibleTanque(
                    miTanque.getCantidadCombustibleTanque() - gastoCombustible);

            if (miTanque.getCantidadCombustibleTanque() == 0)
            {
                Console.WriteLine(i + " - [" +
                miTanque.getCantidadCombustibleTanque() + "]");
                miMotor.ApagarMotor();
                break;
            }
            Console.WriteLine(i + " - ["+
                miTanque.getCantidadCombustibleTanque() + "]");

            Thread.Sleep(milliseconds);

            Console.Clear();
        }                
    }
	
}

class Motor
{
    //Zona de Atributos
    private Boolean enciendeMotor;
     
    //Zona de Métodos
    public Motor(int cantidadCombustible)
    {
        //validar si existe combustible
        if (cantidadCombustible > 0)
            this.enciendeMotor = true;
        else
            this.enciendeMotor = false;
         
    }
     
    public bool EncenderMotor()
    {
        if (enciendeMotor)
        {
            Console.WriteLine("Encendiendo el auto");
            return true;
        }
        else
        {
            Console.WriteLine("No hay combustible");
            return false;
        }
    }

    public bool ApagarMotor()
    {
        Console.WriteLine("Apagando el motor");
        return false;
    }
}

class Odometro
{
    //Zona de Atributos
    private int distanciaRecorrida;

    //Zona de Métodos
    public void setDistanciaRecorrida(int distanciaRecorrida)
    {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getDistanciaRecorrida()
    {
        return distanciaRecorrida;
    }
}

class TanqueCombustible{
	
    private int capacidadTanque;
    private int cantidadCombustibleTanque;
    
    public TanqueCombustible(){
        this.capacidadTanque = 100;
    }

    public void setCantidadCombustibleTanque(int cantidadCombustible)
    {
        if(cantidadCombustible > capacidadTanque || cantidadCombustible < 0){
        	System.out.println("Error al agregar combustible al tanque.");
        }
        else{
        	this.cantidadCombustibleTanque = cantidadCombustible;
        }
    }

    public int getCantidadCombustibleTanque(){
        return cantidadCombustibleTanque;
    }
}