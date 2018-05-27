package KsiazkaAdresowa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AdressBook {

    public static void main (String[] args){

        AdressBookSterowanie adressBook = new AdressBookSterowanie();

        adressBook.add("Tomek", 5);
        adressBook.add("Michal", 4);
        adressBook.add("Kuba", 7);
        adressBook.add("Jas", 3);

        Boolean a =adressBook.doesNameExist("Tomek");
        System.out.println(a);

        Boolean b =adressBook.doesNameExist("Tomek");
        System.out.println(b);

        adressBook.printAll();

























    }
}
