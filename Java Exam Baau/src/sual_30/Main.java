package sual_30;

/**
 * [2,5,2,8,13] massivinin cüt elementlərini kvadratları ilə,tək elementlərini kubları ilə əvəzləyən kod yazın
 */
public class Main {
    public static void main(String[] args) {
        int[] massiv = {2, 5, 2, 8, 13};
        for (int element : massiv) {
            if (element % 2 == 0) {
                element *= element;
            } else {
                element = (int) Math.pow(element, 3);
            }
            System.out.println(element);
        }
    }
}