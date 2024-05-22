package sual_4;

/**
 * NullPointerException xətasını tuta bilən try catch kod nümunəsi yazın
 */
public class Main {
    public static void main(String[] args) {
        Integer girishBali=null;
        long imtahanbali=48;
        try {
            double netice=girishBali+imtahanbali;
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }
}
