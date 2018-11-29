package models;

import java.sql.*;
import java.util.Vector;

import org.springframework.web.bind.annotation.ModelAttribute;

public class UserContext extends DAO{
	
	public Vector<User> getAllUsers() {
		
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
				u.setPassw1(rs.getString(3));
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
			pstmt = conn.prepareStatement("select * from users where login = ?");
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


public void addUser(User u) {
	Connection conn = null;
	PreparedStatement pstmt = null;

	
	try {
		Class.forName(driver);
		conn = DriverManager.getConnection(conURL, DBUser, DBPass);
    	pstmt = conn.prepareStatement("insert into users (login, passw, email, regdate, status) values(?,?,?,?,?)");
		String l = u.getLogin();
		String p = u.getPassw1();
		String e = u.getEmail();
		String r = u.getRegdate();
		String s = u.getStatus();
				
		pstmt.setString(1, l);
		pstmt.setString(2, p);
		pstmt.setString(3, e);
		pstmt.setString(4, r);
		pstmt.setString(5, s);
		pstmt.execute();	
				
	} catch (ClassNotFoundException e) { e.printStackTrace();
	} catch (SQLException e) { e.printStackTrace();
	} finally{
		try {
			if(conn!=null) conn.close();
			if(pstmt!=null) pstmt.close();
		} catch (SQLException e) { e.printStackTrace(); }
	}		
}

}
