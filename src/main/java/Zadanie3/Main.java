package Zadanie3;

public class Main {


    public static void main(String[] args) {
        Author stephen = new Author("Stephen", "King");
        Author henio = new Author("Henryk", "Sienkiewicz");

        BookDao dao = new BookDao();
        dao.bookAdder(new Book("Dzieci kukurydzy", stephen, Cover.SOFT));
        dao.bookAdder(new Book("Pan Tadeusz", new Author("Adam", "Mickiewicz"), Cover.HARD));
        dao.bookAdder(new Book("Jak zjednać sobie ludzi i zdobyć przyjaciół", new Author("Dale", "Carnegie"), Cover.SOFT));
        dao.bookAdder(new Book("Potop", henio, Cover.HARD));
        dao.bookAdder(new Book("Lśnienie", stephen, Cover.SOFT));
        dao.bookAdder(new Book("Pełna moc możliwości", new Author("Jacek", "Walkiewicz"), Cover.SOFT));
        dao.bookAdder(new Book("Lalka", new Author("Bolesław", "Prus"), Cover.HARD));
        dao.bookAdder(new Book("Mały Książe", new Author("Louis", "Saint Exiperie"), Cover.HARD));
        dao.bookAdder(new Book("Bezsenność", stephen, Cover.SOFT));
        dao.bookAdder(new Book("W pustyni i w puszczy", henio, Cover.HARD));


        System.out.println("Sorted by BOOKTITLE");
        dao.sortListByParam(dao.getBookList(), SortParam.BOOKTITLE);
        dao.getBookList().forEach(System.out::println);

        System.out.println("Sorted by AUTHORNAME");
        dao.sortListByParam(dao.getBookList(), SortParam.AUTHORNAME);
        dao.getBookList().forEach(System.out::println);

        System.out.println("Sorted by AUTHORSECONDNAME");
        dao.sortListByParam(dao.getBookList(), SortParam.AUTHORSECONDNAME);
        dao.getBookList().forEach(System.out::println);

        System.out.println("Sorted by CoverType");
        dao.sortListByParam(dao.getBookList(), SortParam.COVERTYPE);
        dao.getBookList().forEach(System.out::println);

        System.out.println("Books of henio autor:");

        dao.autorsBookList(henio);
        dao.autorsBookList(henio).forEach(System.out::println);

        System.out.println("Books of stephen autor:");

        dao.autorsBookList(stephen);
        dao.autorsBookList(stephen).forEach(System.out::println);

        System.out.println("Books of Dale Carnegie autor:");

        dao.autorsBookList("Dale Carnegie");
        dao.autorsBookList("Dale Carnegie").forEach(System.out::println);
    }
}
