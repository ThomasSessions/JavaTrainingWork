package JavaDataBases;

import java.sql.*;

public class FirstDatabase {
	public static void main(String[] args) {
		

	try { 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/thomasdatabase","root","");
		Statement stmt = conn.createStatement();
		ResultSet rec = stmt.executeQuery("SELECT Grade FROM SCHOOL");
		while (rec.next()) {
			System.out.println(rec.getInt(1));
		}
		
		
	}
	catch (Exception x) {
		x.printStackTrace();
	}

}
}
