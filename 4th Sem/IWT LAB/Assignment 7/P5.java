//5.  Write a JDBC program to display all records from the student table.

package jpack;
import java.sql.*;
public class P5 {
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
			String query = "SELECT * FROM STCS";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt("rollno") + " | " + rs.getString("name") + " | " + rs.getInt("age") + " | " + rs.getString("department") + " | " + rs.getDouble("cgpa"));
			}
			stmt.executeUpdate(query);
			System.out.println("Table Displayed successfully!");
			stmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}