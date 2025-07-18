package services;

import model.Book;

import java.sql.SQLException;
import java.sql.Statement;

public class BookService {
    private final Statement statement;

    public BookService() throws SQLException {
        this.statement = DBConnection.getConnection().createStatement();
    }

    public void addNewBook(Book book) throws SQLException {
        String sqlCommand = "INSERT INTO book(title, author, price, stock) VALUES ('" +
                book.getTitle() + "','" +
                book.getAuthor() + "'," +
                book.getPrice() + "," +
                book.getStock() + ")";

        statement.executeUpdate(sqlCommand);
    }

    public void updateBook(int id, double price) throws SQLException {
        String sqlCommand = "UPDATE book SET price = " + price + " WHERE id = " + id;

        statement.executeUpdate(sqlCommand);
    }

    public void deleteBook(int id) throws SQLException {
        String sqlCommand = "DELETE FROM book WHERE id = " + id;

        statement.executeUpdate(sqlCommand);
    }
}
