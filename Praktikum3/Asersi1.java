//file : Asersi1.java 05/03/2024
//nama : Abyan Setyaneva
//NIM  : 24060122130058

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if(x > 0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
