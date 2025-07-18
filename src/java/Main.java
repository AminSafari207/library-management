import model.Book;
import services.BookService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        BookService service = new BookService();

        Book book1 = new Book("test 1", "test 11", 150000.500, 5);
        Book book2 = new Book("test 2", "test 22", 300000.500, 5);

        service.addNewBook(book1);
        service.addNewBook(book2);

//        service.updateBook(4, 70000.750);

//        service.deleteBook(4);
    }
}
