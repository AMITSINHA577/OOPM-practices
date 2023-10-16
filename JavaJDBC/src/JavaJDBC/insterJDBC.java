package JavaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insterJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/employee";
			String username = "root";
			String password = "Mysql@123";

			Connection con = DriverManager.getConnection(url, username, password);
			
			String q = "create table table2(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(200))";
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table created...");
			
			con.close();

		} catch (Exception e) {

			e.printStackTrace();
		}


	}

}
