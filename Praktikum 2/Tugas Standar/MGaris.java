// file : MGaris.java 27/02/2004
// Nama : Abyan Setyaneva
// NIM  : 24060122130058
// Desk : Program main Class Garis

public class MGaris {
    public static void main(String[] args) {
        
        Titik t1 = new Titik(1, 2);
        Titik t2 = new Titik(4, 7);

        Titik t3 = new Titik(-4,3);
        Titik t4 = new Titik(-1,5);
        
     
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);
        Garis g3 = g1.getRefleksiY();
        
        System.out.println("==================== Titik Awal & Akhir ====================");
        System.out.println("T0 garis g1         : " + g1.getTitikAwal().toString());
        System.out.println("T1 garis g1         : " + g1.getTitikAkhir().toString());
        System.out.println("T0 garis g2         : " + g2.getTitikAwal().toString());
        System.out.println("T1 garis g2         : " + g2.getTitikAkhir().toString());
        System.out.println("====================== Panjang garis =======================");
        System.out.println("Panjang garis g1    : " + g1.getPanjang());
        System.out.println("Panjang garis g2    : " + g2.getPanjang());
        System.out.println("====================== Gradien garis =======================");
        System.out.println("gradien garis g1    : " + g1.getGradien());
        System.out.println("gradien garis g2    : " + g2.getGradien());
        System.out.println("============= Refleksi titik g1 terhadap sb-Y ==============");
        System.out.println("T0' garis g1        : " + g3.getTitikAwal().toString());
        System.out.println("T1' garis g1        : " + g3.getTitikAkhir().toString());
        System.out.println("=============== Cek apakah g1 tegak lurus g2 ===============");
        if(g1.isTegakLurus(g2)){
            System.out.println("Garis g1 tegak lurus dengan garis g2");
        }else{
            System.out.println("Garis g1 tidak tegak lurus dengan garis g2");
        }
        System.out.println("============================ END ===========================");
    }
}
