public class main {
    public static void main(String[] args) {
        human human = new human();//odwolanie do klasy


        human.setImie("Robert");

        System.out.println(human.getimie());
        human.setWiek(18);
        human.setPlec("m");
        human.setWaga(80);
        human.setWzrost(90);
        System.out.println(human.getPlec());

    }
}