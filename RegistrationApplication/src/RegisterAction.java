import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	
	String firstName;
	String lastName;
	String gender;
	Integer age;
	String email;
	
	@Override
	public String execute() throws Exception {
		System.out.println("execute() method called");
		return SUCCESS;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
//	public void validate() {
//		
//		if(firstName.equals("")) {
//			addFieldError("firstName", "First name is required.");
//		}
//		
//		if(lastName.equals("")) {
//			addFieldError("lastName", "Last name is required.");
//		}
//		
//		if(gender == null) {
//			addFieldError("gender", "Gender is required.");
//		}
//		
//		if(age == null) {
//			addFieldError("age", "Age is required.");
//		}
//		
//		if(age != null && age <= 18) {
//			addFieldError("age", "Age should be above 18.");
//		}
//		
//		if(email.equals("")) {
//			addFieldError("email", "Email is required.");
//		}
//		
//	}
	

}
