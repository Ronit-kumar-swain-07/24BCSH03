// 1.	Write a Java program to establish a connection with an RDBMS.

package jpack;
import java.sql.*;
public class  P1{
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
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}