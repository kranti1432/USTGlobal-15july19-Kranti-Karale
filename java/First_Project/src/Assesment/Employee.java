package Assesment;

public class Employee {

	private String name;
	private int id;
	private String email;
	private int mo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + ", mo=" + mo + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMo() {
		return mo;
	}
	public void setMo(int mo) {
		this.mo = mo;
	}

}
