//Nama : Abyan Setyaneva
//NIM : 24060122130058
//Lab : B2
 
public class AirPort{
    private String Name;
    private Airplane airplane;
   
    public AirPort(String name){
        this.Name = name;
    }

    public String givePermissionToLand(IFIyer flyer){
        if (flyer instanceof Airplane){
            return "Diizinkan mendarat";
        }
        else{
            return "Dilarang mendarat";
        }
    }

}
