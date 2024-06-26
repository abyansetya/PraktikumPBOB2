//nama : Abyan Setyaneva
//nim  : 24060122130058
//lab  : b2

public class Seaplane extends Airplane{
    private double maxLoad;

    public Seaplane(){
        this.maxLoad = 100;
    }

    public Seaplane(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public double calcFuelEfficency(){
        return this.maxLoad * 0.2;
    }

    public double calcTripDistance(){
        return this.maxLoad * 3;
    }

    public void takeOff(){
        System.out.println("Seaplane Take Off");
    }

    public void land(){
        System.out.println("Seaplane landing");
    }
    public void fly(){
        System.out.println("seaplane fly");
    }
  
    public String toString(){
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}
