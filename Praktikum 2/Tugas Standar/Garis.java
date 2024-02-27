// file : Garis.java 27/02/2004
// Nama : Abyan Setyaneva
// NIM  : 24060122130058
// Desk : Program Class Garis

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik awal, Titik akhir){
        titikAwal = awal;
        titikAkhir = akhir;
    }

    public void setTitikAwal(Titik awal){
        titikAwal = awal;
    }

    public void setTitikAkhir(Titik akhir){
        titikAkhir = akhir;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public double getPanjang(){
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double panjang = Math.sqrt(absis * absis + ordinat * ordinat);
        return Double.parseDouble(String.format("%.2f", panjang));
    }
    

    public double getGradien(){
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double gradien = ordinat / absis;
        return Double.parseDouble(String.format("%.2f", gradien));
    }
    

    public Garis getRefleksiY() {
        // Menghasilkan garis baru hasil refleksi terhadap sumbu Y
        Titik t1 = titikAwal.getRefleksiY();
        Titik t2 = titikAkhir.getRefleksiY();
        return new Garis(t1, t2);
    }

    public boolean isTegakLurus(Garis g) {
        // Mengecek apakah dua garis tegak lurus
        return getGradien() * g.getGradien() == -1;
    }
}
