package KsiazkaAdresowa;

import java.util.HashMap;

public class AdressBookSterowanie {

    HashMap<String, Integer> mapa = new HashMap<>();

    public void add(String name, Integer number) {
        mapa.put(name, number);
    }

    public boolean czyIstnieje(String name) {
        if (mapa.containsKey(name)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean doesNameExist (String name){
        return mapa.containsKey(name);
    }

    public Integer getNumber (String name){

        return mapa.get(name);

    }

    public void printAll(){
        for (String name : mapa.keySet()){
            System.out.println("imie: " + name+ "," + " numer:" + mapa.get(name));
        }
    }





    }








