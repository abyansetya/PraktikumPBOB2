package LatihanMedium;

public class KontrolSenjata{
    private Senjata senjata;

    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    public boolean isAdaPeluru(){
        return this.senjata.getPeluru() > 0;
    }
    public void isiPeluru(int peluru){
        this.senjata.setPeluru(peluru);
        System.out.println("Peluru Berhasil ditambah: "+ peluru);
    }
    public void menembak(int jumlah){
        System.out.println("Siap menembak "+ jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (this.senjata.getPeluru() > 0){
                System.out.println(this.senjata.getBunyi());
                this.senjata.setPeluru(this.senjata.getPeluru()-1);
            }
            else{
                System.out.println("gagal tembak, Peluru Habis");
            }
        }
        System.out.println("Sisa Peluru: " + this.senjata.getPeluru());
    } 
    public String menusuk(){
        if (this.senjata.isMenusuk()== false){
            return "gagal menusuk";
        }
        else {
            return "menusuk";
        }
    }
    public void pasangBayonet(){
        this.senjata.setMenusuk(true);
        System.out.println("Senjata terpasang bayonet");
    }
}
