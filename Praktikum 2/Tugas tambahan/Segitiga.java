// file : Segitiga.java 27/02/2024
// Nama : Abyan Setyaneva
// NIM  : 24060122130058
// Desk : Program Class Segitiga.java

public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    } 

    public double hitungLuas(){
        return (0.5 * alas * tinggi);
    }

}
