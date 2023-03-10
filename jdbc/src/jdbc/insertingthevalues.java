package jdbc;

import java.sql.*;
import java.util.Scanner;

public class insertingthevalues {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String un = "system";
		String pwd = "system";
		boolean b = true;
		while (b) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id number");
			int id = sc.nextInt();

			sc.nextLine();
			System.out.println("Enter name");
			String name = sc.nextLine();

			System.out.println("Enter batch");
			String batch = sc.nextLine();

			String sql = "INSERT INTO  students VALUES(?,?,?)";
			Class.forName(driver);
			// connection is interface
			Connection con = DriverManager.getConnection(url, un, pwd);
			// Statement st = con.createStatement();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, batch);
			ps.executeUpdate();
			System.out.println("If you want to continue to insert a row ?");
			System.out.println("If yes please type \"YES\" OR \"NO\" ");
			String str = sc.nextLine();
			if ("yes".equals(str.toLowerCase())) {
				b = true;
			} else {
				b = false;
				System.out.println("Work is Finished!!");
			}

		}

	}

}
