package Zadanie2;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void saveAndReadObj() {
        Person jas = new Person("Jan", "Kowalski", 23,Gender.MALE);
        Person jan = new Person("Jan","Matuszewski",24,Gender.FEMALE);
        Util util = new Util();
        util.saveObj(jas);
        Object newUtil = new Util();
        newUtil =  util.readObj();
        assertEquals(true,jas.equals(newUtil));
        assertEquals(false,jas.equals(jan));
    }
}