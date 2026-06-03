import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class task31 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "root";

        try (
                Connection con =
                        DriverManager.getConnection(
                                url,
                                user,
                                password);

                Statement stmt =
                        con.createStatement();

                ResultSet rs =
                        stmt.executeQuery(
                                "SELECT * FROM students")
        ) {

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                                + rs.getString("name") + " "
                                + rs.getInt("age"));
            }

        } catch (Exception e) {

            System.out.println(
                    "Error: " + e.getMessage());
        }
    }
}