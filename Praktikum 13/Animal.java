//Nama : Abyan Setyaneva
//nim  : 24060122130058
//lab  : b2

abstract class Animal {
    public abstract void eat();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
