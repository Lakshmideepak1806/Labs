package Lab3;

public class ValidateSalary3 {
double salary;

public ValidateSalary3(double salary) throws EmployeeException3{
	if(salary<3000) {
		throw new EmployeeException3("Salary is below 3000");
	}
	this.salary = salary;
	
}
public static void main(String[] args) {
	try {
		ValidateSalary3 s=new ValidateSalary3(2500);
		
	} catch (EmployeeException3 e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}
}
