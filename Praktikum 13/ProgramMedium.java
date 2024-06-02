//nama : abyan setyaneva
//nim  " 24060122130058
//lab  : b2

import java.util.*;

public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println(truck);
        Seaplane sPlane = new Seaplane();
        System.out.println(sPlane);
        Helicopter copter = new Helicopter();
        System.out.println(copter);
        System.out.println("###########################################");

        List<Truck> armadaTruck = new ArrayList<>();
        List<Seaplane> armadSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("jumlah Armada Truck: "+ armadaTruck.size());
        armadSeaPlane.add(sPlane);
        System.out.println("jumlah Armada SeaPlane: "+ armadSeaPlane.size());
        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("jumlah Armada Helicopter: "+ armadaHelicopter.size());
        System.out.println("###########################################");
        /**
         * Buatlah Kelas ArmadaKendaraan yang memiliki 2 method yaitu tambahArmada()
         * yang dapat menerima suatu Collection dengan batasan tipe kelas yang diijinkan,
         * ingat upperbound generic : Collection <? extends UpperboundClass>
         * dan getAllArmada() untuk mengambil semua kendaraan
         */

        ArmadaKendaraan<vehicle> armadaKendaraan = new ArmadaKendaraan<vehicle>();

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadSeaPlane);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraan.getAllArmada().size());
    }
}
