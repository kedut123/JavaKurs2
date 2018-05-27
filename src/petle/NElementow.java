package petle;

import org.omg.CORBA.portable.ValueInputStream;

import java.util.Scanner;

public class NElementow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dlugoscTabeli = scanner.nextInt();

        int[] tab = new int[dlugoscTabeli];

        for (int i = 0; i < dlugoscTabeli; i++) {
            tab[i] = i + 1;
            System.out.print(tab[i] + " ");


        }
    }
}