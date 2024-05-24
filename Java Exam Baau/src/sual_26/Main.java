package sual_26;

/**
 *  * [2,7,2,8,13]massivin cüt elementlərini kvadratları ilə əvəzləyən metod yazın
 */
public class Main {
    public static void cutElementleriKvadratlariİleEvezle(int [] massiv){
        for(int element: massiv){
            if (element%2==0){
                element=element*element;
            }
            System.out.println(element);
        }

    }

    public static void main(String[] args) {
        int [] massiv={2,7,2,8,13};
        cutElementleriKvadratlariİleEvezle(massiv);
     }
}
