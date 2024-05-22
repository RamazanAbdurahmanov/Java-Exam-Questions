package sual_5;

/**
 * ArrayIndexOutOfBoundexception xətasını tuta bilən try catch kod nümunəsi yazın.Bunu bir Array üzərindən göstərin
 */
public class Main {
    public static void main(String[] args) {
        int[] ededlerMassivi={1,23,45,4,17};
        try {
            System.out.println(ededlerMassivi[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
