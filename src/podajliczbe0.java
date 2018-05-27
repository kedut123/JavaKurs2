
import java.util.Scanner;

public class podajliczbe0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 1;
        int suma = 0;

        while (a != 0) {
            a = scanner.nextInt();
            suma = suma + a;
        }
        System.out.println(suma);


    }


}


