package jdbc;

import java.sql.*;

public class Bank {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pass = "System";
		String table = "create table bank(name Varchar(12),email Varchar(15),address Varchar(16),balance Int)";
		String insert = "insert into bank values(?,?,?,?)";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, un, pass);
		Statement st = con.createStatement();

		st.executeQuery(table);
		PreparedStatement ps = con.prepareStatement(insert);
		String name = null;
		ps.setString(1, name);
		String email = null;
		ps.setString(2, email);
		String address = null;
		ps.setString(3, address);
		int balance = 0;
		ps.setInt(4, balance);
		ps.executeUpdate(insert);

	}

}
