package kolekcje;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class LottoZadanie {
    public static void main(String[] args) {


        HashSet<Integer> liczby = new HashSet<>();
        while (liczby.size()<6) {
            Random random = new Random();
            int x = random.nextInt(49) +1;

            liczby.add(x);
        }
        Iterator iterator = liczby.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+ " , ");     //losowanie 6 liczb z Hashsetu o wielkosci 49
        }




    }
}
