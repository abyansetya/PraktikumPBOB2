// Nama  : Abyan Setyaneva
// NIM   : 24060122130058
// Lab   : B2
// Desk  : Main/Driver Program MTitik.java

public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        Titik t3 = new Titik(2,3);

        System.out.println("jumlah objek titik : " + Titik.getCounterTitik());

        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
    }
}
