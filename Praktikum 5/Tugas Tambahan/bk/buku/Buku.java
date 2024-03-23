//File : Buku.java  23/03/24
//Nama : Abyan Setyaneva
//NIM  : 24060122130058

package bk.buku;

public class Buku{
    private String judul;
    private String penulis;
    private String tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit){
        this.judul = judul;
        this. penulis = penulis;
        this.tahunTerbit = tahunTerbit ;
    }

    public String getJudul(){
        return this.judul;
    }
    public String getPenulis(){
        return this.penulis;
    }
    public String getTahunTerbit(){
        return this.tahunTerbit;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public void view(){
        System.out.println("buku ini berjudul "+ this.getJudul()+ " yang ditulis oleh "+ this.getPenulis()+" dan diterbitkan pada tahun " + this.getTahunTerbit());
    }
}
