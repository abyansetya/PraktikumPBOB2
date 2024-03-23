//File : BukuNonFiksi.java
//Nama : Abyan setyaneva
//NIM  : 24060122130058

package bk.bukuNonFiksi;

import bk.buku.Buku;

public class BukuNonFiksi extends Buku{
    private String subjek;
    private int jumlahHalaman;
    private double harga;

    public BukuNonFiksi(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis ,tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getSubjek(){
        return this.subjek;
    }
    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }
    public double getHarga(){
        return this.harga;
    }
    public void setSubjek(String subjek){
        this.subjek = subjek;
    }
    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    public void view(){
        super.view();
        System.out.println("Subjek dari buku ini adalah " + this.getSubjek()+ " dan total halaman "+ this.getJumlahHalaman() + " dengan harga "+ this.getHarga()+ " Rupiah");
    }
}
