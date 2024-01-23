// te amo ada code
// https://www.youtube.com/watch?v=ZhljL_0gm04&list=LL&index=2&t=337s

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_DB {

    static final String JDBC_DRIVER = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "1234";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(JDBC_DRIVER, USER, PASS);
                Statement stmt = conn.createStatement();) {
            String sql = "CREATE DATABASE VRD";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } // end main
} // end class Create_DB
