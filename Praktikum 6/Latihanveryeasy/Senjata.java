public class Senjata {
    private String Bunyi;
    private int peluru;
    
    public Senjata(String Bunyi){
        this.Bunyi = Bunyi;
        this.peluru = 0;
    }

    public void setBunyi(String bunyi){
        this.Bunyi = bunyi;
    }
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    public String getBunyi(){
        return this.Bunyi;
    }
    public int getPeluru(){
        return this.peluru;
    }
    public void menembak(){
        System.out.println(this.Bunyi);
        this.peluru = this.peluru - 1;
        System.out.println("Sisa Peluru : " + this.getPeluru());
    }
}
