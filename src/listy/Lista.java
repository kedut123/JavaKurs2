package listy;

public class Lista {

    private int[] numbers;
    private int maxSize;
    private int size;

    public Lista(int maxSize) {
        this.maxSize = maxSize;
        numbers = new int[maxSize];
    }

    public int getRozmiarNumbers() {
        return numbers.length;
    }

    public void addElement(int liczba) {
        if (size > maxSize - 1) {
            System.out.println("Lista jest pełna blad");
        } else {

            this.numbers[size] = liczba;
            size++;


        }

    }

    public void elementyListy() {
        System.out.println("Elementy listy: ");
        for (int i=0; i< numbers.length; i++){
            System.out.print(numbers[i]+ " , ");
        }
    }

    public int find(int liczba) {
        for (int i = 0; i < getRozmiarNumbers(); i++) {
            if (liczba == numbers[i]) {
                return i;
            }


        }return -1;


    }
    public void details(){
        System.out.println(maxSize);
        elementyListy();
    }


}



