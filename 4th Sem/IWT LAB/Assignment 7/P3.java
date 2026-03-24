// 3.	Write a JDBC program to insert two student records into the student table with values given inside the program (hard-coded).


package jpack;
import java.sql.*;
public class P3 {
	public static void main(String[] args) {
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
			String query = "INSERT INTO STCS VALUES(1,'Raj',18,'CSE',9.9)";			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Table created successfully!");

			stmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}