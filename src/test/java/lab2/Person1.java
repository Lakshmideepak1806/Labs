package lab2;


public class Person1 {
String name;
float age;

public Person1(String name, float age) {
	super();
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getAge() {
	return age;
}
public void setAge(float age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person1 [name=" + name + ", age=" + age + "]";
}

	}

class Account{
	long accNum;
	double balance;
	Person1 accHolder;
	public Account(long accNum, double balance, Person1 accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person1 getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person1 accHolder) {
		this.accHolder = accHolder;
	}
	void deposit(double amount) {
		if(balance>0) {
			balance=balance+amount;
		}
	}
	void withdraw(double amount) {
		if(amount > 0 &&(balance-amount)>500 ) {
			balance=balance-amount;
		}
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	


}
