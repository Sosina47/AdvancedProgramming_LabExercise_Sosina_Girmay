import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/notepad_db";
            String user = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}