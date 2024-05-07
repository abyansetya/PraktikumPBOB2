public class Senjata {
    private String Bunyi;
    private int peluru;
    private boolean menusuk;
    
    public Senjata(String Bunyi){
        this.Bunyi = Bunyi;
        this.peluru = 0;
        this.menusuk = false;
    }
    public void setBunyi(String bunyi){
        this.Bunyi = bunyi;
    }
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    public String getBunyi(){
        return this.Bunyi;
    }
    public int getPeluru(){
        return this.peluru;
    }
    public boolean isMenusuk(){
        return this.menusuk;
    }
}
