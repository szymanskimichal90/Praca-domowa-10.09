package Zadanie2;

public class Main {
    public static void main(String[] args) {
        Person jas = new Person("Jan", "Kowalski", 23,Gender.MALE);
        Util <Person> util = new Util();
        util.saveObj(jas);
        Object nowy = new Util();
        nowy =  util.readObj();
        System.out.println(jas);
        System.out.println(nowy);
        System.out.println(jas.equals(nowy));
        System.out.println(jas==nowy);
        System.out.println("************");
        System.out.println(jas.hashCode());
        System.out.println(nowy.hashCode());
    }
}
