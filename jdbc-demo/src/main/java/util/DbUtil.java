package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Author: Mohan Adhikari Chhetri
 * Since: 2/1/2021
 */
public class DbUtil {
    public static final String Driver = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/demo_db"; //link to database
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(Driver);
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);

    }
}