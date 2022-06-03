package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionn {
    private String jdbcURL = "jdbc:mysql://localhost:3306/moduel3?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";

//    public Connectionn getConnectionn() {
//        java.sql.Connection connection = null;
//        try {
//            // Đổi class hiện tại về quản lý như 1 drive
//            Class.forName("com.mysql.jdbc.Driver");
//
//            //Quản lý connection vs driver manager
//            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return (Connectionn) connection;
//    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            java.lang.Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}