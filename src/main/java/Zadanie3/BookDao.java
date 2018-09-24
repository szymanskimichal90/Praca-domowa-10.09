package Zadanie3;


import java.util.*;

public class BookDao<T> {
    private List<Book> bookList = new ArrayList<Book>() {
    };

    public void bookAdder() {
        Author stephen = new Author("Stephen", "King");
        Author henio = new Author("Henryk", "Sienkiewicz");
        bookList.add(new Book("Dzieci kukurydzy", stephen, Cover.SOFT));
        bookList.add(new Book("Pan Tadeusz", new Author("Adam", "Mickiewicz"), Cover.HARD));
        bookList.add(new Book("W pustyni i w puszczy", henio, Cover.HARD));
        bookList.add(new Book("Jak zjednać sobie ludzi i zdobyć przyjaciół", new Author("Dale", "Carnegie"), Cover.SOFT));
        bookList.add(new Book("Potop", henio, Cover.HARD));
        bookList.add(new Book("Lśnienie", stephen, Cover.SOFT));
        bookList.add(new Book("Pełna moc możliwości", new Author("Jacek", "Walkiewicz"), Cover.SOFT));
        bookList.add(new Book("Lalka", new Author("Bolesław", "Prus"), Cover.HARD));
        bookList.add(new Book("Mały Książe", new Author("Louis", "Saint Exiperie"), Cover.HARD));
        bookList.add(new Book("Bezsenność", stephen, Cover.SOFT));
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

    public List<Book> autorsBookList(Author author) {
        List<Book> autorsBooksList = new ArrayList<Book>();
        for (Book book:bookList) {if (book.getAuthor().getName().equals(author.getName())) {
            autorsBooksList.add(book);
        }
            
        }


        return autorsBooksList;
    }

}
