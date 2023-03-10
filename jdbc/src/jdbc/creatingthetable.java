package jdbc;

import java.sql.*;

public class creatingthetable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pwd = "system";
		// CREATING THE TABLE
		String table = "CREATE TABLE students(id NUMBER,name VARCHAR2(15),batch VARCHAR2(8))";
		
		// LOADING INTO THE BROWSER
		Class.forName(driver);
		// CONNECTION ESTABLISHING
		Connection con = DriverManager.getConnection(url, un, pwd);
		Statement st = con.createStatement();
		st.executeQuery(table);

	}

}
