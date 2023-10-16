package JavaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert2JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/employee";
			String userName = "root";
			String password = "Mysql@123";
			
			Connection con = DriverManager.getConnection(url, userName, password);
			
			String q = "insert into table2(tName, tCity) values(?,?)";
			
			PreparedStatement pstmt =  con.prepareStatement(q);
			pstmt.setString(1, "amit sinha");
			pstmt.setString(2, "dewas");
			pstmt.executeUpdate();
			System.out.println("inserted...");
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
