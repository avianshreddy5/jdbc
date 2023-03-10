package jdbc;

import java.sql.*;

public class updatethevalue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pwd = "system";
		String sql = "UPDATE students SET name='krutika' WHERE id=111";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, un, pwd);
		Statement st = con.createStatement();
		st.executeUpdate(sql);

	}

}
