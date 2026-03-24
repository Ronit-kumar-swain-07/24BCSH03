package jpack;
import java.sql.*;
import java.util.Scanner;
public class P6 {
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
			System.out.println("Enter new CGPA: ");
			Double cgpa = sc.nextDouble();
			String query = "UPDATE STCS SET CGPA = ? WHERE rollno= ?";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(2, rollno);
			pstmt.setDouble(1, cgpa);

			pstmt.executeUpdate();
			System.out.println("Values Updated successfully!");

			pstmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}