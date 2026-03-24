/*4.	Write a JDBC program to insert a student record into the student table. Take inputs for roll_no,  name, age, department,
and cgpa from the key board using Scanner.
*/
package jpack;
import java.sql.*;
import java.util.Scanner;
public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String driver = "org.postgresql.Driver";
			String url = "jdbc:postgresql://192.168.1.17/cse_db24";
			String username = "24bcsh03";
			String password = "24bcsh03";
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			
			if(con != null) {
				System.out.println("Connected........");
			}
			System.out.println("Enter the Roll No. :");
			int rollno = sc.nextInt();
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println("Enter Age: ");
			int age = sc.nextInt();
			System.out.println("Enter Branch: ");
			String department = sc.next();
			System.out.println("Enter CGPA: ");
			Double cgpa = sc.nextDouble();
			String query = "INSERT INTO STCS (rollno, name, age, department, cgpa) VALUES (?, ?, ?, ?, ?)";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, rollno);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setString(4, department);
			pstmt.setDouble(5, cgpa);

			pstmt.executeUpdate();
			System.out.println("Value Inserted successfully!");

			pstmt.close();	
//			Statement stmt = con.createStatement();
//	            stmt.executeUpdate(query);
//	            System.out.println("Value Inserted successfully!");
//	            stmt.close();
// 				con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}