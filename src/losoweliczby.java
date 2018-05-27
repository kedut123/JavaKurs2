import java.util.Random;

public class losoweliczby {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];
        for (int i = 0; i<tab.length;i++)
        {
            tab [i]= random.nextInt(40)-20;
            System.out.print(tab[i] + " , ");


        }
        int a = 0;//średnia arytmetyczna
        //int suma = 0;// suma wszystich liczb
        int suma = tab [0]+ tab[1];


        System.out.println(suma);




    }


    }


