package jdbc;

import java.sql.*;
import java.util.Scanner;

public class fectchingthevalue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pwd = "system";
		String d = "";
		// *1*String sql = "SELECT * FROM STUDENTS where name='sangamanath'";
		// *2*String sql = "SELECT * FROM STUDENTS where name = ?";
		// *3*String sql = "update STUDENTS set id=? where name=?";
		// *4*String sql = "SELECT * FROM STUDENTS where id = ?";
		String sql = "SELECT * FROM emp";

		System.out.println("please enter name to get the details of Particular user");
		// Scanner s = new Scanner(System.in);
		// String c = s.nextLine();
//		System.out.println("Enter id");
		// int id = s.nextInt();
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, un, pwd);
		Statement st = con.createStatement();
		// PreparedStatement is interface
		// PreparedStatement ps=con.prepareStatement(sql);
		// ps.setInt(1, id);
		// ps.setString(1, c);
		// ResultSet rs = ps.executeQuery();
		// st.executeUpdate(sql);
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			d = rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " "
					+ rs.getInt(5) + " " + rs.getDate(6) + " " + rs.getString(7) + " " + rs.getInt(8) + " "
					+ rs.getInt(9) + " " + rs.getInt(10) + " " + rs.getInt(11);
			System.out.println(d);

		}

	}

}
