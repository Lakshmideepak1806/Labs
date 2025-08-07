package lab2;

public class BankMain2 {

	    public static void main(String[] args) {
	        Person2 smith = new Person2("Smith", 30.0f);
	        Person2 kathy = new Person2("Kathy", 25.0f);
	  
	        SavingsAccount smithAcc1 = new SavingsAccount(232344324l, 2000, smith);
	        CurrentAccount kathyAcc1 = new CurrentAccount(23747348348l, 3000, kathy);

	        smithAcc1.deposit(2000);                  
	        kathyAcc1.withdraw(1000);               
	        System.out.println(smithAcc1);
	        System.out.println(kathyAcc1);
	    }
	}


