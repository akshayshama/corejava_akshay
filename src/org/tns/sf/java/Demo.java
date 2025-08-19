package org.tns.sf.java;

class Person5{
	
}
class Employee extends Person5{
	
}
class Manager extends Employee{
	
}



public class Demo {

	public static void main(String[] args) {
		Person5 person=new Person5();
		Employee emp=new Employee();
		Manager mng = new Manager();
		System.out.println(emp instanceof Employee);
		System.out.println(emp instanceof Manager);
		
	}

}
