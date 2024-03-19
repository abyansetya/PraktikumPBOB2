//File : MBujurSangkar.java 19/03/2024
//Nama : Abyan Setyaneva
//NIM  : 24060122130058
//desk : kelas yang mengimplementasikan cara menghitung luas bujur sangkar

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BujurSangkar bs = new BujurSangkar();

        System.out.println("Masukkan sisi BujurSangkar: ");

        double sisi = scan.nextDouble();

        System.out.println("Luas BujurSangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
