//File : Main.java
//Nama : AByan setyanvea
//NIM  : 24060122130058


package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {
    public static void main(String[] args){
        BukuAkademik Buku1 = new BukuAkademik("Trading Crypto Anti Rungkad", "Willy", "2024", "crypto", 34, 150000);
        BukuNovel Buku2 = new BukuNovel("I love you, Arga", "Fakhrel Andreaz", "2024", "romantic & horror", 69, 420000);

        Buku1.view();
        Buku2.view();
    }
}
