package Zadanie2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Util<T> {


    public void saveObj(T object) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("C:\\Programowanie\\Java\\Niedziela09092018PracaDomowa\\src\\main\\resources\\Object.txt"))) {

            oos.writeObject(object);
            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void readObj() {
        try (ObjectInputStream oos =
                     new ObjectInputStream(new FileInputStream("C:\\Programowanie\\Java\\Niedziela09092018PracaDomowa\\src\\main\\resources\\Object.txt"))) {

            T newObject = (T) oos.readObject();
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}





