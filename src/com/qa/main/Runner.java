package com.qa.main;

public class Runner {

	public static void main(String[] args) {
	
		Customer thing1 = new Customer();
		Customer thing2 = new Customer();
		Customer thing3 = new Customer();
		Customer thing4 = new Customer();

		thing1.setFirstName("Luke");
		thing2.setFirstName("Yoda");
		thing3.setFirstName("BatMan");
		thing4.setFirstName("BatWoman");
		
		thing1.setSurname("Money");
		thing2.setSurname("Donkey");
		thing3.setSurname("Uno");
		thing4.setSurname("Skywalker");
		
		System.out.println(thing1.getFirstName());
		System.out.println(thing1.getSurname());
		
		System.out.println(thing2.getFirstName());
		System.out.println(thing2.getSurname());
		
		System.out.println(thing3.getFirstName());
		System.out.println(thing3.getSurname());
		
		System.out.println(thing4.getFirstName());
		System.out.println(thing4.getSurname());
		
		System.out.println(Customer.getNumberOfPeople()); 
		
		
		
		
		
		
	}

}
