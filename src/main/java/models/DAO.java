package models;

public class DAO {
	
	protected String DBHost;
	protected String DBUser;
	protected String DBPass;
	protected String DBName;
	protected String driver;
	protected String conURL;
	
	public DAO() {		
		DBHost = "localhost";
		DBUser = "root";
		DBPass = "root";
		DBName = "mining_shop_db_";
		driver = "com.mysql.jdbc.Driver";
//		driver = "com.mysql.cj.jdbc.Driver";
		conURL = "jdbc:mysql://" + DBHost + ":3306/" + DBName  + "?useUnicode=yes&characterEncoding=UTF-8";
	}
	
	
}
