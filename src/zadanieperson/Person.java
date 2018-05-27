package zadanieperson;

public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void yearPases() {
        age++;
    }

    public String amIOld() {
        if (age <= 19) {
            return "Teenager";
        } else {
            return "Old";
        }

    }
}



