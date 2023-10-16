package JavaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class firstJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/employee";
			String username = "root";
			String password = "Mysql@123";

			Connection con = DriverManager.getConnection(url, username, password);
			if (con.isClosed()) {
				System.out.println("connection is closed");
			} else {
				System.out.println("connection created....");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
