package com;

public class Person6 {
	String FirstName;
	String LastName;
	String PhnNumber;
	enum gender
	{
		M,F
	}
	

public Person6(String firstName, String lastName, String phnNumber) {
		super();
		FirstName = firstName;
		LastName = lastName;

		PhnNumber = phnNumber;
	}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}


public String getPhnNumber() {
	return PhnNumber;
}

public void setPhnNumber(String phnNumber) {
	PhnNumber = phnNumber;
}

void display() {
	System.out.println("First Name: "+getFirstName());
	System.out.println("Last Name: "+getLastName());

	System.out.println("Gender: "+Person6.gender.M);
}
void PhnNumber() {
	System.out.println("Phone number:"+getPhnNumber());
}

public static void main(String[] args) {
	Person6 p=new Person6("N", "Lakshmi Deepak", "9550140422");
	p.display();
	p.PhnNumber();
}
}
