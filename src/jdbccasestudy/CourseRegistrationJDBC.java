package jdbccasestudy;

import java.sql.*;
import java.util.Scanner;

public class CourseRegistrationJDBC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Connect to MySQL (update password below!)
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/course_db", "root", "Yash@9347"
            );

            while (true) {
                System.out.println("\n1. Add Course\n2. View Courses\n3. Update Faculty\n4. Delete Course\n5. Exit");
                int choice = sc.nextInt(); sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID, Name, Faculty, Credits: ");
                        int id = sc.nextInt(); sc.nextLine();
                        String name = sc.nextLine();
                        String faculty = sc.nextLine();
                        int credits = sc.nextInt();

                        PreparedStatement ps1 = con.prepareStatement("INSERT INTO courses VALUES (?, ?, ?, ?)");
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setString(3, faculty);
                        ps1.setInt(4, credits);
                        ps1.executeUpdate();
                        System.out.println("✅ Course Added.");
                        break;

                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM courses");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " | " +
                                               rs.getString(2) + " | " +
                                               rs.getString(3) + " | " +
                                               rs.getInt(4));
                        }
                        break;

                    case 3:
                        System.out.print("Enter Course ID and new Faculty name: ");
                        int cid = sc.nextInt(); sc.nextLine();
                        String newFaculty = sc.nextLine();
                        PreparedStatement ps2 = con.prepareStatement(
                            "UPDATE courses SET faculty=? WHERE course_id=?");
                        ps2.setString(1, newFaculty);
                        ps2.setInt(2, cid);
                        ps2.executeUpdate();
                        System.out.println("✅ Faculty Updated.");
                        break;

                    case 4:
                        System.out.print("Enter Course ID to delete: ");
                        int delId = sc.nextInt();
                        PreparedStatement ps3 = con.prepareStatement(
                            "DELETE FROM courses WHERE course_id=?");
                        ps3.setInt(1, delId);
                        ps3.executeUpdate();
                        System.out.println("✅ Course Deleted.");
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        con.close();
                        return;

                    default:
                        System.out.println("❌ Invalid option.");
                }
            }

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
