package sual_12;

/**
 * Car(maşın) class yaradıb,uyğun dəyişənlər yaradıb  inkapsulyasiya edin
 */
public class Car {
    private String marka;
    private String matorNovu;
    private int maxSuret;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMatorNovu() {
        return matorNovu;
    }

    public void setMatorNovu(String matorNovu) {
        this.matorNovu = matorNovu;
    }

    public int getMaxSuret() {
        return maxSuret;
    }

    public void setMaxSuret(int maxSuret) {
        this.maxSuret = maxSuret;
    }
}
