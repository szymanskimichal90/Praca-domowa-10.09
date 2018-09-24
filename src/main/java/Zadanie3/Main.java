package Zadanie3;

public class Main {


    public static void main(String[] args) {
        BookDao dao = new BookDao();
        dao.bookAdder();
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

        dao.autorsBookList()




    }
}
