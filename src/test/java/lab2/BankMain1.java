package lab2;

public class BankMain1 {
	public static void main(String[] args) {
		Person1 smith=new Person1("Smith", 40f);
		Person1 kathy=new Person1("Kathy", 30f);
		Account smithacc=new Account(238373467, 2000, smith);
		Account kathyacc=new Account(327434847, 3000, kathy);
		System.out.println();
		smithacc.deposit(2000);
		kathyacc.withdraw(2000);
		System.out.println("Smith account balance after deposit:-"+smithacc.getBalance());
		System.out.println("kathy account balance after withdraw:-"+kathyacc.getBalance());
		System.out.println(smithacc);
		System.out.println(kathyacc);
	}
}
