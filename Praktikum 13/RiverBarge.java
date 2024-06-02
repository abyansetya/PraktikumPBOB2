public class RiverBarge {
    private double maxLoad = 100;

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double getMaxLoad(){ 
        return this.maxLoad;
    }

    public double calcFuelEfficency(){ 
        return this.maxLoad * 0.5;
    }

    public double calcTripDistance(){
        return this.calcFuelEfficency() * 5;
    }
}
