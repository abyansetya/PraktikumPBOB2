import java.util.*;

public class ArmadaKendaraan<T extends vehicle>{
    private List<T> armadakendaraan = new ArrayList<>();

    public void tambahArmada(List<? extends T> armada){
        for(int i = 0; i<=(armada.size()-1); i+=1) {
    		armadakendaraan.add(armada.get(i));
		}
    }
    public List<T> getAllArmada(){
        return armadakendaraan;
    }

}
