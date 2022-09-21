package project.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreator {
    private final static String USER_NAME = "postgres";
    private final static String PASSWORD = "Password12345";
    private final static String URL = "jdbc:postgresql://localhost/planets";
    private final static String JDBC_DRIVER = "org.postgresql.Driver";

    public ConnectionCreator() {

    }

    public static Connection createConnection() throws SQLException {
        Connection connection = null;

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
