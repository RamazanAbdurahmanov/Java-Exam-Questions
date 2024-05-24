package sual_25;

/**
 * [2,7,8,1,3]massivin tək elementlərini kubları ilə əvəzləyən metod yazın
 */
public class Main {
    public static void tekToKub(int []massiv){
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]%2!=0){
                massiv[i]= (int) Math.pow(massiv[i],3 );
            }
            System.out.println(massiv[i]);

        }
    }

    public static void main(String[] args) {
        int[] massiv={2,7,8,1,3};
        tekToKub(massiv);
    }
}
