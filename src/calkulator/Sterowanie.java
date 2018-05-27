package calkulator;

public class Sterowanie {

    public Sterowanie(int i) {
    }

    public static void main(String[] args){

        double liczba = 3.5;
        double liczba2 = 2;
        System.out.println("Czy jest nieparzysta? " + Kalkulator.isOdd(liczba));
        System.out.println("Czy jest parzysta? " + Kalkulator.isEven(liczba));
        System.out.println("liczba pierwistek z wartosci bezwzglednej " + Kalkulator.sqrt(liczba));
        System.out.println("wartość bezwzgledna "+ Kalkulator.abs(liczba));
        System.out.println("wartość zaokraglonadogory " + Kalkulator.roundUp(liczba));
        System.out.println("wartość podniesiona do potegi " + Kalkulator.pow(liczba,liczba2));
        System.out.println("suma dwoch licz " + Kalkulator.suma(liczba,liczba2));





    }
}
