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
}
