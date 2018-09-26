package Zadanie3;


import java.util.*;

public class BookDao<T> {
    private List<Book> bookList = new ArrayList<Book>() {
    };

    public void bookAdder(Book book) {
        bookList.add(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public List<Book> sortListByParam(List list, SortParam param) {
        List<Book> newList = new ArrayList<Book>();
        newList = list;
        switch (param) {
            case BOOKTITLE:
                Comparator<Book> bookTitleComparator = new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getTopic().compareTo(o2.getTopic());
                    }
                };
                Collections.sort(newList, bookTitleComparator);
                break;
            case AUTHORNAME:
                Comparator<Book> bookAuthorNameComparator = new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthor().getName().compareTo(o2.getAuthor().getName());
                    }
                };
                Collections.sort(newList, bookAuthorNameComparator);
                break;
            case AUTHORSECONDNAME:
                Comparator<Book> bookAuthorSecondNameComparator = new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getAuthor().getSecondName().compareTo(o2.getAuthor().getSecondName());
                    }
                };
                Collections.sort(newList, bookAuthorSecondNameComparator);
                break;
            case COVERTYPE:
                Comparator<Book> coverTypeComparator = new Comparator<Book>() {
                    @Override
                    public int compare(Book o1, Book o2) {
                        return o1.getCover().compareTo(o2.getCover());
                    }
                };
                Collections.sort(newList, coverTypeComparator);
                break;
        }
        return newList;
    }

    public List<Book> autorsBookList(T author) {
        List<Book> autorsBooks = new ArrayList<Book>();
        if (author instanceof Author) {
            for (Book book : bookList) {
                if (author.equals(book.getAuthor())) {
                    autorsBooks.add(book);
                }
            }
        } else if (author instanceof String) {
            for (Book book : bookList) {
                if ((book.getAuthor().getName() + " " + book.getAuthor().getSecondName()).equals(author))
                    autorsBooks.add(book);
            }
        }
        return autorsBooks;
    }

    public Book giveMeBook(String title) {
        Book result = null;
        for (Book book : bookList) {
            if (book.getTopic().contains(title)) {
                result = book;
            }
        }
        return result;
    }
}
