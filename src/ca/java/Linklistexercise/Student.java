package ca.java.Linklistexercise;

public class Student {
	private int id;
	private String fullName;
	private String email;
	
	public Student(int id, String fullName, String email) {
		setId(id);
		setFullName(fullName);
		setEmail(email);
	}

	public int getId() {
		return id;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setFullName(String fullName) {
		if(!fullName.isEmpty() && !fullName.equalsIgnoreCase(null)) {
			this.fullName = fullName;
		} else {
			this.fullName = "Unkown";
		}
	}

	public void setEmail(String email) {
		if(!email.isEmpty() && !email.equalsIgnoreCase(null)) {
		this.email = email;
		} else {
			this.email = email;
		}
	}
	
	@Override
	public String toString() {
		return "Student ID : " + id
				+ "\nName : " + fullName
				+ "\nEmail : " + email;
	}
	
}
