package Zadanie3;
import java.util.ArrayList;

import java.util.Set;
import java.util.TreeSet;

public class Author{

  String name;
  String secondName;
    Set<Book> listName = new TreeSet<Book>();







    public Author(String name, String secondName) {

        this.name = name;
        this.secondName = secondName;

    }

    public void addBook(Book title){
        listName.add(title);

    }


}
