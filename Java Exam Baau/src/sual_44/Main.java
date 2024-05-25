package sual_44;

/**
 * Qalığı hesablayan return type və void type iki metod yazın,amma % işarəsi istifadə etməyin.
 */
public class Main {
    public static int qaliq(int bolunen, int bolen) {
        //9:2=4(1)
        int qaliq = bolunen - (bolunen / bolen * bolen);
        return qaliq;
    }

    public static void qaliqHesabla(int bolunen, int bolen) {
        int qaliq = bolunen - bolunen / bolen * bolen;
        System.out.println(qaliq);
    }

    public static void main(String[] args) {
        System.out.println(qaliq(9, 4));
        qaliqHesabla(11, 5);
    }

}
