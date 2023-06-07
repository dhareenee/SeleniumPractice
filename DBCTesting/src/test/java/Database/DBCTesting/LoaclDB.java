package Database.DBCTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class LoaclDB {
	@Test
	public void localdbconnecter() throws SQLException
	{
		System.out.println("hello");
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadb", "root", "Sql@141");
		System.out.println(con);
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("Select * from student where STUDENT_ID=10 ");
		while(rs.next()) {
			System.out.println(rs.getString("first_name"));
			System.out.println(rs.getInt("exam_score"));
		}
		
		
	}

}
