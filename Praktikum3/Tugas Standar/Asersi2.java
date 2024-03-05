//file : Asersi2.java 05/03/2024
//nama : Abyan Setyaneva
//NIM  : 24060122130058

import static java.lang.Math.PI;

public class Asersi2 {
    public static void main(String[] args) {
        double jarijari = 0;
        assert(jarijari>0):"jari jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jarijari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungKeliling(){
        double keliling = 2*PI*jarijari;
        return keliling;
    }
}

//kesalahan konsep adalah assert tidak menangani kondisi jika jari jari kurang dari nol, sehingga jika kurang dari nol, akan tetap mencetak "jari jari tidak boleh nol"
