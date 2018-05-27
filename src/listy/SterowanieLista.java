package listy;

public class SterowanieLista {

    public static void main(String[] args){

        Lista lista = new Lista(3);
        System.out.println("rozmiar: " + lista.getRozmiarNumbers());
        lista.addElement(10);
        lista.addElement(30);
        lista.addElement(50);
        lista.addElement(540);
        lista.elementyListy();
        System.out.println( );
        System.out.println("znaleziono na pozycji " + (lista.find(40)));
        lista.details();



    }

}
