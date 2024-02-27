// file : MTitik.java 27/02/2004
// Nama : Abyan Setyaneva
// NIM  : 24060122130058
// Desk : Program main Class Titik

public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        Titik t3 = new Titik(2,3);

        System.out.println("========================= Titik t1, t2, t3 =========================");
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        System.out.println("======================== Jarak titik ke (0,0) ======================");
        System.out.println("jarak titik t1  : " + t1.getJarakPusat());
        System.out.println("jarak titik t2  : " + t2.getJarakPusat());

        System.out.println("============== titik setelah direfleksi terhadap sb-X ==============");
        System.out.println("t1" + t1.getRefleksiX());
        System.out.println("t2" + t2.getRefleksiX());
        System.out.println("t3" + t3.getRefleksiX());

        System.out.println("============== titik setelah direfleksi terhadap sb-Y ==============");
        System.out.println("t1" + t1.getRefleksiY());
        System.out.println("t2" + t2.getRefleksiY());
        System.out.println("t3" + t3.getRefleksiY());
        System.out.println("=============================== END ================================");


    }
}

//Kesimpulan :
//             Pada eksperimen pemanggilan atribut dan method dari objek titik adalah method yang memiliki access modifier public atau default
//             dapat diakses di class MTitik.java, sedangkan ketika kita mengganti access modifier dari salah satu method di Titik.java menjadi 
//             private, maka method tidak dapat dipanggil.
