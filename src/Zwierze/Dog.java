package Zwierze;

public class Dog extends Zwierze {

   int wiek;
   public Dog (int wiek){
       this.wiek=wiek;
   }

    @Override
    public String toString() {
        return "Dog{" +
                "wiek=" + wiek +
                '}';
    }

}


