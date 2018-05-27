package kolekcje.gra;

import java.util.Scanner;

public class BullsAndCowTablica {

    public static void main (String[] args)
    {
        String[] tab = new String[4];

        tab[0] ="k";
        tab[1] ="r";
        tab[2] ="e";
        tab[3] ="m";


        String krem2 = tab[0] + tab [1] + tab [2] + tab[3] ;


        System.out.println("Słowo ma " + ((tab.length)) + " liter");

        System.out.println("podaj słowo");

        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.nextLine();


        if (slowo.length()>tab.length || slowo.length()<tab.length)
        {
            System.out.println("podales slowo ze zla iloscia znakow");
        }
        else {


            if (slowo.equals(krem2)) {
                System.out.println("podales dobre słowo");
            } else {
                System.out.println("podałes zle slowo");

            }



        }










    }
}
