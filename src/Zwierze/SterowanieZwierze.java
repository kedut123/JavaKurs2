package Zwierze;

import java.util.ArrayList;
import java.util.List;

public class SterowanieZwierze {

    public static void main (String [] args){

        Horse horse = new Horse(5);
        Dog dog = new Dog(5);


        List<Zwierze>mojaLista = new ArrayList<>();
        mojaLista.add(horse);
        mojaLista.add(dog);


        for (int i=0 ; i< mojaLista.size();i++){
            System.out.println(mojaLista.get(i));
        }











    }
}
