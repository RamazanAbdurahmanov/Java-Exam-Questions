package sual_6;

/**
 * Bir sinifə aid 3 fərqli parametrli amma eyni adlı metod təyin edib,bunları istifadə edin.
 */
public class Main {

    //Buna Metod Overloading deyirler-Compile Time Polymorphism
    public static int topla(int a,int b){
        return (a+b);
    }
    public int topla(int a,int b,int c){
        return (a+b+c);
    }
    public int topla(double a,short b){
        return (int) (a+b);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.topla(5,6);
        main.topla(2,3,4);
        topla(5,9);

    }
}
