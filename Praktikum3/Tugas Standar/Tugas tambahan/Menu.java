//file : Menu.java 06/03/2024
//Nama : Abyan Setyaneva
//NIM  : 24060122130058
//lab  : B2

public class Menu {
    private String nama;
    private double harga;
    private int stok;


    public Menu(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }


    public double getHarga() {
        return harga;
    }


    public void setHarga(double harga) {
        this.harga = harga;
    }


    public int getStok() {
        return stok;
    }


    public void setStok(int stok) {
        this.stok = stok;
    }


    public void kurangiStok(int jumlah) {
    //Tambahkan metode untuk mengurangi stok
       if(jumlah <= stok){
        stok -= jumlah;
       }
    }
}
