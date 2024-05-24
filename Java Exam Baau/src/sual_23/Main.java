package sual_23;

/**
 * [2,7,8,5,3]massivin ədədi ortasından böyük olan ədələri çap edən metod yazın
 */

public class Main {
    public static void ortadanBoyukler(int[] massiv){
        int cem=0;
        for(int element:massiv){
            cem+=element;
        }
        double edediOrta=cem/massiv.length;

        for (int element:massiv){
            if(element>edediOrta){
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {
        int [] massiv={2,7,8,5,3};
        ortadanBoyukler(massiv);
    }

}
