//nama : Abyan Setyaneva
//nim  : 24060122130058
//lab : b2

public class Bird extends Animal implements IFIyer{
    @Override
    public void takeOff(){
        System.out.println("bird take off");
    }

    @Override
    public void land(){
        System.out.println("bird landing");
    }

    @Override
    public void fly(){
        System.out.println("bird fly");
    }
    public void buildNest(){
        System.out.println("bird build nest");
    }
    public void layEgs(){
        System.out.println("bird lay eggs");
    }
    public void eat(){
        System.out.println("bird eat worm");
    }
}
