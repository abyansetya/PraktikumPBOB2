// File : PersegiPanjang.java 16/03/2024
// Nama : Abyan Setyaneva
// NIM  : 24060122130058
// Desk : representasi dasar dari objek persegi panjang, turunan kelas poligon

package org.bangundatar;
import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun persegi panjang bersisi : " + this.getJumlahSisi());
    }
}

 
