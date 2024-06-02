//nama : Abyan Setyaneva
//nim  : 24060122130058
//lab  : b2

public abstract class vehicle {
    public abstract double calcFuelEfficency();
    public abstract double calcTripDistance();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
