//7.  Write a JDBC program to delete a student record based on roll_no. Accept the roll number from the keyboard.

package jpack;
import java.sql.*;
import java.util.Scanner;
public class P7 {
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
			
			String query = "DELETE FROM STCS WHERE rollno = ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, rollno);

			pstmt.executeUpdate();
			System.out.println("Table Updated successfully!");

			pstmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}