package jdbc;

import java.sql.*;

public class DbInsert {

	public static void main(String args[]) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest","root","tiger");
		
		PreparedStatement stmt=con.prepareStatement("insert into emp1 values(?,?,?,?,?)");
		
		stmt.setInt(1,8);
		stmt.setString(2, "ram");
		stmt.setInt(3, 32);
		stmt.setString(4, "puna");
		stmt.setInt(5, 108);
		int i=stmt.executeUpdate();
		System.out.println(i+" records added to the Table");
		
		con.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
