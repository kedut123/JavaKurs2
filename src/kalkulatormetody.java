import java.util.Scanner;

public class kalkulatormetody {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        System.out.println("mnożenie to " + (double) a * b);
//        System.out.println("dzielenie to " + (double) a / b);

        System.out.println(mnozenie(a, b));
        System.out.println(dzielenie(a, b));
    }


    public static int mnozenie(int a, int b) {
        return a * b;
    }


    public static double dzielenie(int a, int b) {

        if (b == 0) {
            System.out.println("podales zero");
            return 0;
        } else {

            return (double) a / b;
        }
    }
}