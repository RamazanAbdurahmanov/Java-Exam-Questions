package sual_17;

/**
 * Sinif yaradın və sinifin üç dəyişəni olsun.Daha sonra bu dəyişənlərə həm set metodu ilə həm də
 * constructorla dəyər göndərin.
 */
public class Baau {
    private String fakulte;
    private String ixtisas;
    private  int kurs;

    public Baau(String fakulte, String ixtisas, int kurs) {
        this.fakulte = fakulte;
        this.ixtisas = ixtisas;
        this.kurs = kurs;
    }

    public String getFakulte() {
        return fakulte;
    }

    public void setFakulte(String fakulte) {
        this.fakulte = fakulte;
    }

    public String getIxtisas() {
        return ixtisas;
    }

    public void setIxtisas(String ixtisas) {
        this.ixtisas = ixtisas;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }
}
