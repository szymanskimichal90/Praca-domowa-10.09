package Zadanie3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Desk {

    List<Book> bookList = new ArrayList<Book>();


    public Desk() {

    }

    public void addBook(Book title) {
        bookList.add(title);

    }
//@Override
//    public String toString() {
//        StringBuilder toSringResult = new StringBuilder("Book: ");
//        toSringResult.append(" tytuł: ").append(getTopic);
//        toSringResult.append(", okładka: ").append(cover.getPolski());
//        return toSringResult.toString();
//
//    }

    public String getBooks() {
        Collections.sort(bookList);
        StringBuilder getBooksResult = new StringBuilder();
        for (Book book : bookList) {
            getBooksResult.append(book.toString()).append("\n");
        }


        return getBooksResult.toString();
    }

    public void removeBook(Book book) throws BookNotExistOnTheDesk {
        if (bookList.contains(book)) {
            bookList.remove(book);
        } else {
            throw new BookNotExistOnTheDesk("Nie ma ksiazki w biurku");
        }

    }
}
