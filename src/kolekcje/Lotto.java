package kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        HashSet<Integer> liczby = new HashSet<>();
        liczby.add(4);
        liczby.add(6);
        liczby.add(8);
        liczby.add(2);
        System.out.println("Rozmiar setu " + liczby.size());
        Iterator iterator = liczby.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() +" , ");      //drugi sposob wyswietlania liczb za pomoca iteratora
        }
        System.out.println();                              //jeden ze sposobow wyswietlania liczb z HashSetu
        for (Integer liczba: liczby){
            System.out.print(liczba + " , ");
        }
        System.out.println();
        liczby.remove(4);                              //usuwanie liczby z HashSet
        for (Integer liczba:liczby){
            System.out.print(liczba+ " , ");
        }






    }

}
