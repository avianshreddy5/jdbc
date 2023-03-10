package jdbc;

import java.sql.*;
import java.util.Scanner;

public class updatingthevaluesusinguserinput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pwd = "system";
		String sql = "UPDATE students SET name=? WHERE id=?";
		System.out.println("enter id");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		s.nextLine();
		System.out.println("enter name");
		String name = s.nextLine();
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, un, pwd);
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, name);
		pt.setInt(2, id);
		pt.executeUpdate();

	}

}
