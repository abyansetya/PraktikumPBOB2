//file : AngkaSial.java 05/03/2024
//nama : Abyan Setyaneva
//NIM  : 24060122130058

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//setelah terjadi exception, perintah cetak "bukan angka sial" tidak lagi dieksekusi karena akan masuk ke kondisional if dan langsung masuk ke AngkaSialException
//kemudian karena terjadi exception, maka pada main akan langsung masuk ke catch san mengeksekusi ase.getMessage()
