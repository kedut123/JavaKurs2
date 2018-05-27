package petle;

import java.util.Scanner;

public class petlaImiona {
    public static void main (String[] args) {

        String [] tab;
        tab = new String[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 5 imion");
        String imie1 = scanner.nextLine();
        String imie2 = scanner.nextLine();
        String imie3 = scanner.nextLine();
        String imie4 = scanner.nextLine();
        String imie5 = scanner.nextLine();


       tab[0] = imie1;
       tab[1] = imie2;
       tab[2] = imie3;
       tab[3] = imie4;
       tab[4] = imie5;

        for (int i = 0; i<tab.length; i++)
            System.out.println("Witaj " + tab[i]);









    }
}
