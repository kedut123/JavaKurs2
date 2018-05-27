import java.util.Scanner;

public class ZganijLiczbe {
    public static void main (String[] args )
    {
        System.out.println("zgadnij liczbe 5");

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        while (a != 5)
        {
            a = scanner.nextInt();
           System.out.println("podales zla liczbe");
            b = b + a;
            }

        System.out.println("podales 5");
        System.out.println("suma wpisanych liczb to " + b);




    }
}
