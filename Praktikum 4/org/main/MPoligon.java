// File : MPoligon.java 16/03/2024
// Nama : Abyan Setyaneva
// NIM  : 24060122130058
// Desk : driver class untuk poligon, persegi panjang, dan segitiga

package org.main;
import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(10, 5, 3);
        segitiga.printInfo();
        System.out.println("Luas segitiga : " + segitiga.hitungLuas());
    }


    
}
