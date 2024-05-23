package sual_13;

public class Main implements Oxumali{
    @Override
    public void minMohteshemGunesh() {
        System.out.println("Xalid Huseyinin mohtesem eseri");
    }

    @Override
    public void metro2033() {
        System.out.println("Dmitry Glukhovskyin mohtesem eseri");

    }

    public void oxu(String kitab){
        System.out.println(kitab+"ı oxu");

    }
    public void oxu(String kitab,String muellif){
        System.out.println(muellif+"in "+kitab+"ını oxu");


    }
}
