public class Superman extends Kryptonian{
    private String nama;

    public Superman(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    @Override
    public void takeOff(){
        System.out.println(this.nama + "takeoff");
    }
  @Override
    public void land(){
        System.out.println(this.nama + "landing");
    }
  @Override
    public void fly(){
        System.out.println(this.nama + "flying");
    }
    public void leapBuilding(){
        System.out.println(this.nama + "leap the building");
    }
    public void stopBullet(){
        System.out.println(this.nama + " eat");
    }
    public void eat(){
        System.out.println(this.nama + "mangan");
    }

}
