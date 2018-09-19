package Zadanie2;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void saveAndReadObj() {
        Person jas = new Person("Jan", "Kowalski", 23,Gender.MALE);
        Person jan = new Person("Jan","Matuszewski",24,Gender.FEMALE);
        Util<Person> util = new Util();
        util.saveObj(jas);
        Util<Person> util2 = new Util();
        util2.readObj();
        assertEquals(true,jas.toString().equals(util2.toString()));
        assertEquals(false,jas.equals(jan));
    }
}