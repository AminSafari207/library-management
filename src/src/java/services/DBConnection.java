package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    public DBConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/library_management";
        String user = "postgres";
        String pass = "";

        connection = DriverManager.getConnection(url, user, pass);
        System.out.println("DB Connection was successful.");
    }

    public Connection getConnection() {
        return connection;
    }
}
