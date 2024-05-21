package sual_3;

/**
 * ArithmeticException xətasını tuta bilən try catch kod nümunəsi yazın
 */
public class Main {
    public static void main(String[] args) {
       int bolunen=10;
       int bolen=0;
       try {
           double qismet=bolunen/bolen;
       }catch (ArithmeticException e){
           System.out.println("O-a bölmə yoxdur!");
       }




    }
}
