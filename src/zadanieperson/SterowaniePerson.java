package zadanieperson;

public class SterowaniePerson {

    public static void main(String[] args) {
        Person myPerson = new Person(18);//piszemy raz

        myPerson.yearPases();//wywolujemy dzialania w Person

        System.out.println(myPerson.amIOld());

        myPerson.yearPases();// Ponowne wywolywanie z Person

        System.out.println(myPerson.amIOld());


    }

    }

