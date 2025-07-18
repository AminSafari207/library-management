package services;

import model.Book;

import java.sql.SQLException;
import java.sql.Statement;

public class BookService {
    public void addNewBook(Book book) throws SQLException {
        String sqlCommand = "INSERT INTO book(title, author, price, stock) VALUES ('" +
                book.getTitle() + "','" +
                book.getAuthor() + "'," +
                book.getPrice() + "," +
                book.getStock() + ")";

        Statement statement = DBConnection.getConnection().createStatement();
        statement.executeUpdate(sqlCommand);
    }

    public void updateBook(int id, double price) throws SQLException {
        String sqlCommand = "UPDATE book SET price = " + price + " WHERE id = " + id;

        Statement statement = DBConnection.getConnection().createStatement();
        statement.executeUpdate(sqlCommand);
    }

    public void deleteBook(int id) throws SQLException {
        String sqlCommand = "DELETE FROM book WHERE id = " + id;

        Statement statement = DBConnection.getConnection().createStatement();
        statement.executeUpdate(sqlCommand);
    }
}
