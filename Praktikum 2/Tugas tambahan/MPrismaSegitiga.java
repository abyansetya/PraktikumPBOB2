// file : MPrismaSegitiga.java 27/02/2024
// Nama : Abyan Setyaneva
// NIM  : 24060122130058
// Desk : Program Class MPrismaSegitiga.java

public class MPrismaSegitiga {
    public static void main(String[] args) {
      
        // instansiasi segitiga sebagai alas
        Segitiga segitiga = new Segitiga(3, 4);
        //instansiasi prisma
        PrismaSegitiga prisma = new PrismaSegitiga(segitiga, 5);
        //menentukan volume prisma
        double volume = prisma.hitungVolume();
        //menghitung luas permukaan prisma
        double luasPermukaan = prisma.hitungLuasPermukaan();
        
        System.out.println("========================= Membuat segitiga =========================");
        System.out.println("Alas segitiga     : " + segitiga.getAlas());
        System.out.println("Tinggi segitiga   : " + segitiga.getTinggiSegitiga());
        System.out.println("Luas segitiga     : " + segitiga.hitungLuas());
        System.out.println("========== Menghitung volume prisma dengan tinggi prisma 5 =========");
        System.out.println("Volume prisma segitiga: " + volume);
        System.out.println("============ Menghitung luas permukaan prisma segitiga =============");
        System.out.println("Luas permukaan prisma segitiga: " + luasPermukaan);
        System.out.println("================================ END ===============================");
    }
}
