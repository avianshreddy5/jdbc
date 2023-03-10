package jdbc;

import java.sql.*;

public class demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driver= "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pw = "system";
		//loading the driver
		Class.forName(driver);
		//establishing the connection
		Connection con = DriverManager.getConnection(url, un, pw);
		System.out.println("Connection established");

	}

}
