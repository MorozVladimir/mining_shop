package models;

import java.sql.*;
import java.util.Vector;

public class UserContext extends DAO{
	
	public Vector<User> getAllNews() {
		
		Vector<User> users = new Vector<User>();	
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(conURL, DBUser, DBPass);
			stmt = conn.createStatement();
			String sql = "select * from users";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				User u = new User();
				u.setId(rs.getInt(1));
				u.setLogin(rs.getString(2));
				u.setPassw(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setRegdate(rs.getString(5));
				u.setStatus(rs.getString(6));
				users.add(u);
			}
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		} finally{
			try {
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
				if(stmt!=null) stmt.close();
			} catch (SQLException e) { e.printStackTrace(); }
		}		
		return users;
	}
	
public boolean isContain(String l) {
		
		boolean isContain = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(conURL, DBUser, DBPass);
			pstmt = conn.prepareStatement("select * from user where login = ?");
			pstmt.setString(1, l);
			rs = pstmt.executeQuery();
			if(rs.next()) {isContain = true;}
			
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} catch (SQLException e) { e.printStackTrace();
		} finally{
			try {
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) { e.printStackTrace(); }
		}		
		if(isContain == true) { return true; }
		else { return false; }
	}


}
