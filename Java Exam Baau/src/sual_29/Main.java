package sual_29;

/**
 * [2,7,8,1,3] massivinin 3-ə bölünməyən ədədlərini özündən böyük 3-ə bölünən ədələ əvəzləyən metod yazın.
 */
public class Main {
    public static void evezleme(int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 3 != 0) {
                int yeniDeyer = massiv[i] + 1;
                while (yeniDeyer % 3 != 0) {
                    yeniDeyer++;
                }
                massiv[i] = yeniDeyer;
            }
            System.out.println(massiv[i]);
        }
    }

    public static void main(String[] args) {
        int[] massiv = {2,7,8,1,3};
        evezleme(massiv);
    }
}
