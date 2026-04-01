package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false);
			st = conn.createStatement();
			
			int rowns1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			//int x = 1;
			//if (x < 2) {
			//	throw new SQLException("Fake error");
			//}
			
			int rowns2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit();
			
			System.out.println("rowns1 " + rowns1);	
			System.out.println("rowns2 " + rowns2);	
		}
		
		catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}
}