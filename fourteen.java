package bha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class fourteen{

	public static void main(String[] args) throws SQLException {
		Connection conInfo = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/employee_db",
				 "root", "root");
		
		String readData = "insert * from employees where"
				+ " id = ?";
		
		PreparedStatement cq = 
				conInfo.prepareStatement(readData);
		
		cq.setInt(1, 100);
//		select * from employees where id = 1
		ResultSet rs = cq.executeQuery();
		
		while(rs.next())
		{
			int empId = rs.getInt(1);
			String empName = rs.getString(2);
			int empAge = rs.getInt(3);
			
			System.out.println(empId + " " + empName + " " + empAge);
		}
	}
}