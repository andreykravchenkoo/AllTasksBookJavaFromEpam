package project.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreator {
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "Fyutkjxtr2003";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/video";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public ConnectionCreator() {

    }

    public static Connection createConnection() throws SQLException {
        Connection connection = null;

        try {
            Class.forName(DRIVER);

            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
