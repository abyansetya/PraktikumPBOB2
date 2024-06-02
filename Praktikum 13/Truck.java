//nama : Abyan SEtyaneva
//nim  : 24060122130058
//Lab  : B2

public class Truck extends vehicle{
    private double maxLoad;

    public Truck(){
        this.maxLoad = 1000;
    }

    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public String toString(){
        return "Truck adalah angkutan darat yang sangat handal";
    }

    public double getMaxload(){ 
        return this.maxLoad;
    }
    @Override
    public double calcFuelEfficency(){ 
        return this.maxLoad * 0.3;
    }
    @Override
    public double calcTripDistance(){
        return this.calcFuelEfficency() * 50;
    }

}
