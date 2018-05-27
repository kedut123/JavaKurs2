package kolekcje;

import java.util.ArrayList;
import java.util.Collections;

public class ListaKolorow {
    public static void main(String[] args) {

        ArrayList<String> listaKolorow = new ArrayList<String>();
        listaKolorow.add("zolty");
        listaKolorow.add("niebieski");
        listaKolorow.add("czerwony");
        listaKolorow.add("zielony");
        listaKolorow.add("bialy");


        System.out.println(listaKolorow);

        listaKolorow.add(0,"czarny");


        System.out.println(listaKolorow);

        Collections.sort(listaKolorow);
        System.out.println(listaKolorow);


    }
}
