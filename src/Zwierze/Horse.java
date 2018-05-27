package Zwierze;

public class Horse extends Zwierze {

    int iloscKopyt;
    public Horse (int iloscKopyt){
        this.iloscKopyt= iloscKopyt;

    }

    @Override
    public String toString() {
        return "Horse{" +
                "iloscKopyt=" + iloscKopyt +
                '}';
    }
}
