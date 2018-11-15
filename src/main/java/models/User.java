package models;

public class User {
	
	private int id;
	private String login;
	private String passw;
	private String email;
	private String regdate;
	private String status;
	
	public User() {}
	
	public User(String login, String passw, String email, String regdate, String status) {
		this.login = login;
		this.passw = passw;
		this.email = email;
		this.regdate = regdate;
		this.status = status;
	}
	
	public int getId() { return id; }
	public String getLogin() { return login; }
	public String getPassw() { return passw; }
	public String getEmail() { return email; }
	public String getRegdate() { return regdate; }
	public String getStatus() { return status; }
	
	public void setId(int id) { this.id = id; }
	public void setLogin(String login) { this.login = login; }
	public void setPassw(String passw) { this.passw = passw; }
	public void setEmail(String email) { this.email = email; }
	public void setRegdate(String regdate) { this.regdate = regdate; }
	public void setStatus(String status) { this.status = status; }	
	
}
