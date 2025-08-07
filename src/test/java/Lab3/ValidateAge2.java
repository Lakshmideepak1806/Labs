package Lab3;

public class ValidateAge2 {
int age;

public ValidateAge2(int age)throws AgeInvalidException2 {
if(age<=15) {
	
	throw new AgeInvalidException2("Age should be above 15");
}
	this.age = age;
}
public static void main(String[] args) {
	try {
		ValidateAge2 a=new ValidateAge2(10);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Exception:"+e.getMessage());
	}
}

}
