package jdbccasestudy;

import java.sql.*;
import java.util.Scanner;

public class ProductInventoryJDBC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/inventory_db", "root", "Yash@93471"
            );

            while (true) {
                System.out.println("\n1. Add Product\n2. View Products\n3. Update Quantity\n4. Delete Product\n5. Exit");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID, Name, Quantity, Price: ");
                        int id = sc.nextInt(); sc.nextLine();
                        String name = sc.nextLine();
                        int qty = sc.nextInt();
                        double price = sc.nextDouble();

                        PreparedStatement ps1 = con.prepareStatement("INSERT INTO products VALUES (?, ?, ?, ?)");
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setInt(3, qty);
                        ps1.setDouble(4, price);
                        ps1.executeUpdate();
                        System.out.println("✅ Product Added.");
                        break;

                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM products");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + " | " +
                                               rs.getString(2) + " | Qty: " +
                                               rs.getInt(3) + " | ₹" +
                                               rs.getDouble(4));
                        }
                        break;

                    case 3:
                        System.out.print("Enter Product ID and new Quantity: ");
                        int pid = sc.nextInt();
                        int newQty = sc.nextInt();
                        PreparedStatement ps2 = con.prepareStatement("UPDATE products SET quantity=? WHERE product_id=?");
                        ps2.setInt(1, newQty);
                        ps2.setInt(2, pid);
                        ps2.executeUpdate();
                        System.out.println("✅ Quantity Updated.");
                        break;

                    case 4:
                        System.out.print("Enter Product ID to delete: ");
                        int delId = sc.nextInt();
                        PreparedStatement ps3 = con.prepareStatement("DELETE FROM products WHERE product_id=?");
                        ps3.setInt(1, delId);
                        ps3.executeUpdate();
                        System.out.println("✅ Product Deleted.");
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
