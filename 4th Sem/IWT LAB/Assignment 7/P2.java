/*
2.	Write a Java program to create a table named student in the connected database with the
following fields: roll_no (INT, Primary Key), name (VARCHAR(50)), age (INT), department (VARCHAR(30)), cgpa (FLOAT(4,2)
*/

package jpack;
import java.sql.*;
public class P2 {
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
			String query = "CREATE TABLE STCS(ROLLNO INT PRIMARY KEY, NAME VARCHAR(20) NOT NULL,AGE INT,DEPARTMENT VARCHAR(30),CGPA NUMERIC(4,2))";			
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