//File : BangunDatar.java 19/03/2024
//Nama : Abyan Setyaneva
//NIM  : 24060122130058
//desk : kelas abstrak, berisi abstraksi bangun datar

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}
