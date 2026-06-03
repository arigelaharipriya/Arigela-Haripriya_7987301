import java.sql.*;

class Task32 {

    String url = "jdbc:mysql://localhost:3306/school";
    String user = "root";
    String password = "root";

    public void insertStudent(int id, String name, int age) {

        String sql =
                "INSERT INTO students VALUES(?,?,?)";

        try (
                Connection con =
                        DriverManager.getConnection(
                                url, user, password);

                PreparedStatement ps =
                        con.prepareStatement(sql)
        ) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            ps.executeUpdate();

            System.out.println("Student Inserted");

        } catch (SQLException e) {

            System.out.println(
                    "Error: " + e.getMessage());
        }
    }

    public void updateStudent(int id, String name) {

        String sql =
                "UPDATE students SET name=? WHERE id=?";

        try (
                Connection con =
                        DriverManager.getConnection(
                                url, user, password);

                PreparedStatement ps =
                        con.prepareStatement(sql)
        ) {

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Student Updated");

        } catch (SQLException e) {

            System.out.println(
                    "Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Task32 dao = new Task32();

        dao.insertStudent(
                1,
                "Ravi",
                20);

        dao.updateStudent(
                1,
                "Ravi Kumar");
    }
}