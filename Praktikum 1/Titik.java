// Nama  : Abyan Setyaneva
// NIM   : 24060122130058
// Lab   : B2

public class Titik {
    double absis;
    double ordinat;
    static double counterTitik;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double a, double b){
        absis = a;
        ordinat = b;
        counterTitik++;
    }

    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static double getCounterTitik(){
        return counterTitik;
    }


}
