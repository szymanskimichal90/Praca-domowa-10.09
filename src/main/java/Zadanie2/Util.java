package Zadanie2;


import java.io.*;

public class Util<T> {
    private static final String NAME_OF_FILE = "MyObject.obj";


    public void saveObj(T object) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NAME_OF_FILE))) {

            oos.writeObject(object);
            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

   // T newObject;


    public T readObj() {
        T resultObject = null;
        File file = new File(NAME_OF_FILE);
        if (file.exists()) {
            try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(NAME_OF_FILE))) {

                resultObject = (T) oos.readObject();
                System.out.println("Done");

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        return resultObject;
    }
}




