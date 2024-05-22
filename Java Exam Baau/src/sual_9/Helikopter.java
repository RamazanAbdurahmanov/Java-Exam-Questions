package sual_9;

/**
 * Helikopter və Teyyare adlı classlar yaradın və bu classların ortaq xüsusiyətlərini bir interfeysdə
 * cəmləyib inheritance edin.
 */
public class Helikopter implements UcusVasiteleri{
    @Override
    public void uc() {
        System.out.println("Helikopter havaya qalxdi");
    }

    @Override
    public void en() {
        System.out.println("Helikopter yere endi");
    }

    @Override
    public void mator() {
        System.out.println("Helikopterin guclu matoru var");

    }

    @Override
    public void sernisin() {
        System.out.println("Helikopterde 4 sernisin var");
    }
}
