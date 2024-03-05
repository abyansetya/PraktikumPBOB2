//file : ExceptionOnArray.java 05/03/2024
//nama : Abyan Setyaneva
//NIM  : 24060122130058

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
