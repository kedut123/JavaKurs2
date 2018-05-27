package calkulator;

public class Kalkulator {

    public static boolean isOdd(double number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isEven(double number) {
        if (number % 2 == 1) {
            return false;

        } else {
            return true;
        }
    }


    public static double sqrt(double b){
        return Math.sqrt(abs((b)));
    }
    public static double abs (double c){
        return Math.abs(c);
    }

    public static double roundUp (double c ) {
        return Math.round(c);
    }

    public static double pow(double d,double e){
        return Math.pow(d,e);

    }

    public static double suma(double f, double g){
        return (f+g);
    }

}



