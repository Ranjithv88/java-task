import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String password = "root";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            System.out.println("|ID\t|Name\t|Salary\n---------------------");
            while (rs.next()) {
                System.out.println("|"+rs.getInt("id") + "\t|" + rs.getString("name") + "\t|" + rs.getInt("salary"));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

