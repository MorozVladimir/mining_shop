package models;

public class User {
	
	private int id;
	private String Login;
	private String passw1;
	private String passw2;
	private String email;
	private String regdate;
	private String status;
	
	public User() {}
	
	public User(String Login, String passw1, String passw2, String email, String regdate, String status) {
		this.Login = Login;
		this.passw1 = passw1;
		this.passw2 = passw2;
		this.email = email;
		this.regdate = regdate;
		this.status = status;
	}
	
	public int getId() { return id; }
	public String getLogin() { return Login; }
	public String getPassw1() { return passw1; }
	public String getPassw2() { return passw2; }
	public String getEmail() { return email; }
	public String getRegdate() { return regdate; }
	public String getStatus() { return status; }
	
	public void setId(int id) { this.id = id; }
	public void setLogin(String Login) { this.Login = Login; }
	public void setPassw1(String passw1) { this.passw1 = passw1; }
	public void setPassw2(String passw2) { this.passw2 = passw2; }
	public void setEmail(String email) { this.email = email; }
	public void setRegdate(String regdate) { this.regdate = regdate; }
	public void setStatus(String status) { this.status = status; }	
	
}
