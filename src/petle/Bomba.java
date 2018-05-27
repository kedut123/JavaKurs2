package petle;

import java.util.Scanner;

public class Bomba {
    public static void main (String[] args){
        System.out.println("podaj czas ");
        Scanner scanner = new Scanner(System.in);
        int czas = scanner.nextInt();

        for (int i = czas; i>= 0; i--)
            System.out.println("bomba wybuchnie za " + i);
        {
            System.out.println("BOOOM");
        }

        int i = 0;
        i = czas;
        while (i >= 0)
        {
            System.out.println("druga bomba wybuchnie za " + i);

            i--;
        }
        System.out.println("2 bomba tez boom");



    }


}
