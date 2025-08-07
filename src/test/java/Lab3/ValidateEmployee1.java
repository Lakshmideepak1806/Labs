package Lab3;

public class ValidateEmployee1 {
	String firstName;
	String lastName;
	
	public ValidateEmployee1(String firstName, String lastName) throws NameBlankException1 {
	if(firstName==null||firstName.contains("")||lastName==null||lastName.contains("")) {
		throw new NameBlankException1("First name and last name cannot be blank");
	}
	
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFullName() {
		return firstName+" "+lastName;
	}
	public static void main(String[] args) {
		
		try {
			ValidateEmployee1 emp=new ValidateEmployee1("N", "Lakshmi Deepak");
			ValidateEmployee1 emp1=new ValidateEmployee1("", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception:"+e.getMessage());
		}
	}



}
