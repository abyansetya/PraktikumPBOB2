//Nama : Abyan Setyaneva
//NIM : 24060122130058
//Lab : B2


public class Helicopter extends Airplane{
    private double maxLoad;

    public Helicopter(){
        this.maxLoad = 100;
    }
    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public double calcFuelEfficency(){
        return this.maxLoad * 0.5;
    }
    public double calcTripDistance(){
        return this.maxLoad * 2;
    }
    public void takeOff(){
        System.out.println("Helicopter Take Off");
    }
    public void land(){
        System.out.println("Helicopter landing");
    }
    public void fly(){
        System.out.println("Helicopter fly");
    }

    public String toString(){
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
