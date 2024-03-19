//File : MLingkaran.java 19/03/2024
//Nama : Abyan Setyaneva
//NIM  : 24060122130058
//desk : implementasi cara menghitung luas lingkaran

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lingkaran l = new Lingkaran(10.2);
        System.out.println("masukkan jari-jari : ");
        double jejari = scan.nextDouble();

        System.out.println("Luas Lingkaran dengan jejari "+ jejari +" satuan adalah: " + l.hitungLuas() );

    }
}
