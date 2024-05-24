package sual_31;

/**
 * [2,5,2,8,13] massivin cüt elementlərini iki vahid artığı ilə,tək elementlərini kvadratları ilə əvəzləyən kod yazın
 */
public class Main {
    public static void main(String[] args) {
        int[] massiv = {2, 5, 2, 8, 13};
        for (int element : massiv) {
            if (element % 2 == 0) {
                element += 2;
            } else {
                element *= element;
            }
            System.out.println(element);
        }
    }
}