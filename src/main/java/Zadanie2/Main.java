package Zadanie2;

public class Main {
    public static void main(String[] args) {
        Person jas = new Person("Jan", "Kowalski", 23,Gender.MALE);
        Util util = new Util();
        util.saveObj(jas);
        util.readObj();
    }
}
